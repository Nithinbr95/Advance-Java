package com.xworkz.javaProject.service;

import com.xworkz.javaProject.dto.PersonDetailsDto;

public  class NithinInformation extends AbstractPersonInformation {

	@Override
	public boolean validatePersonDetailsDto(PersonDetailsDto persondetailsdto) {
		System.out.println("Validate method is running");
		System.out.println("validate GaneshInformation");
		if(persondetailsdto!=null) {
			if(persondetailsdto.getName().length()<3) {
				System.out.println("enter correct name");
		}else {
			System.out.println("entered  name is correct");
		}
	
			if(persondetailsdto.getAge()<18) {
				System.out.println("enter correct Age");
		}else {
			System.out.println("entered correct Age");
	}
		
			if(persondetailsdto.getContactNo()<10) {
				System.out.println("enter correct Contact Number");
		}else {
			System.out.println("entered correct Number");
	}
		
			if(persondetailsdto.getAddress().length()<3) {
				System.out.println("enter correct Address");
		}else {
			System.out.println("entered correct Address");
	}
		}
		return false;
	}

}
