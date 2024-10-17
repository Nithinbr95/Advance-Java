package com.xworkz.vendor.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.xworkz.complaint.Repository.ComplaintRepoImplementation;
import com.xworkz.complaint.service.ComplaintService;
import com.xworkz.complaint.service.ComplaintServiceImplements;

import com.xworkz.vendor.dto.ComplaintsDto;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ComplaintRunner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Choice Below");
		System.out.println("Enter '1' To save the ProductDto");
		System.out.println("Enter '2' To read the ProductDetails");
		System.out.println("Enter 3 to Update the values");
		System.out.println("Enter 4 to delete the productdelete");
		int choice = 0;
		choice = sc.nextInt();
		ComplaintsDto complaintdto =new ComplaintsDto();
		complaintdto.setComplaintId(23);
		complaintdto.setCompliteName("Damage");
		complaintdto.setDate(LocalDateTime.now());
		complaintdto.setProductname("EarBuds");
		ComplaintService service = new ComplaintServiceImplements(new ComplaintRepoImplementation());
		ComplaintsDto updatebyid = new ComplaintsDto();
		 updatebyid.setComplaintId(23);
		 updatebyid.setCompliteName("MisProduct");
		 updatebyid.setProductname("EarBuds");
		 updatebyid.setDate(LocalDateTime.now());
	 String delete = service.deleteById(23, updatebyid);

		while(choice<=4){
			switch (choice) {
			case 1:
				
				System.out.println(service.validate(complaintdto));
				
				break;
			case 2:
				System.out.println(service.getAll());
				break;
			case 3:
				System.out.println(service.updateById(23,updatebyid));
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
