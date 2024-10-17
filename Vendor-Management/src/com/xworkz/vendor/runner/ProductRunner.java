package com.xworkz.vendor.runner;

import java.util.Scanner;

import com.xworkz.product.Repository.ProductRepoImplementation;
import com.xworkz.product.dto.ProductDto;
import com.xworkz.product.service.ProductService;
import com.xworkz.product.service.ProductServiceImpl;


import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductRunner {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Choice Below");
	System.out.println("Enter '1' To save the ProductDto");
	System.out.println("Enter '2' To read the ProductDetails");
	System.out.println("Enter 3 to Update the values");
	System.out.println("Enter 4 to delete the productdelete");
	int choice = 0;
	choice = sc.nextInt();
	ProductDto product = new ProductDto();
	product.setProdName("Watch");
	product.setProdId(2);
	product.setPrice(1000);
	product.setProdweight(20f);
	ProductService service = new ProductServiceImpl(new ProductRepoImplementation());
//	System.out.println(service.validate(product));
//	System.out.println(service.getAll());

	ProductDto updateById = new ProductDto();
	updateById.setProdName("Book");
	updateById.setProdId(2);
	updateById.setPrice(1500);
	updateById.setProdweight(200f);
 String delete = service.deleteById(2, updateById);

	while(choice<=4){
		switch (choice) {
		case 1:
			
			System.out.println(service.validate(product));
			
			break;
		case 2:
			System.out.println(service.getAll());
			break;
		case 3:
			System.out.println(service.updateById(2,updateById));
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
