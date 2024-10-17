package com.xworkz.vendor.runner;

import java.util.Scanner;

import com.xworkz.product.Repository.ProductRepoImplementation;
import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImpl;
import com.xworkz.vendor.Repository.VendorRepositoryimplementation;
import com.xworkz.vendor.dto.VendorDto;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImplementation;

 import lombok.AllArgsConstructor;
 
public class VendorRunner {
  public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
		System.out.println("Enter Choice Below");
		System.out.println("Enter '1' To save the VendorDto");
		System.out.println("Enter '2' To read the VendorDto");
		System.out.println("Enter 3 to Update the values");
		System.out.println("Enter 4 to delete the Vendordelete");
		int choice = 0;
		choice = sc.nextInt();
		VendorDto dto = new VendorDto();
		dto.setVendorId(1);
		dto.setVendorName("Suresh");
		dto.setTypeOfProduct("Phone");
		dto.setVendorContact(9878474834l);
		dto.setVendorEmail("suresh@gmail.com");
		VendorService service = new VendorServiceImplementation(new VendorRepositoryimplementation());

		VendorDto updatebyid = new VendorDto();
		 updatebyid.setVendorId(1);
		 updatebyid.setVendorName("Ramesh");
		 updatebyid.setTypeOfProduct("Laptop");
		 updatebyid.setVendorContact(9878474834l);
		 updatebyid.setVendorEmail("ramesh@gmail.com");
		 String delete = service.deleteById(1, updatebyid);

		while(choice<=4){
			switch (choice) {
			case 1:
				
				System.out.println(service.validate(dto));
				
				break;
			case 2:
				System.out.println(service.getAll());
				break;
			case 3:
				System.out.println(service.updateById(1,updatebyid));
				System.out.println(service.getAll());
				break;
			case 4:
				System.out.println(delete);
				System.out.println(service.getAll());
			default:
				System.out.println("Invalid Number");
				System.out.println("Enter the value 1,2,3,and 4");
				break;
			}
		   System.out.println("Enter Your choice");
			choice = sc.nextInt();
		}
  }
}
	
