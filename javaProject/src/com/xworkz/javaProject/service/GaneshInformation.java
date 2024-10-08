package com.xworkz.javaProject.service;

import com.xworkz.javaProject.dto.PersonDetailsDto;

public  class GaneshInformation extends AbstractPersonInformation{

	@Override
	public boolean validatePersonDetailsDto(PersonDetailsDto persondetailsdto) {
		System.out.println("validate GaneshInformation");
		if(persondetailsdto!=null) {
			if(persondetailsdto.getName().length()<3) {
				System.out.println("enter correct name");
		}else {
			System.out.println("entered correct name");
		}
			if(persondetailsdto.getAge()>18) {
				System.out.println("enter incorrect Age");
		}else {
			System.out.println("entered correct Age");
	}
		
			if(persondetailsdto.getContactNo()<10) {
				System.out.println("enter correct Contact Number");
		}else {
			System.out.println("entered correct Number");
	}
		
			if(persondetailsdto.getAddress().length()>3) {
				System.out.println("enter incorrect Address");
		}else {
			System.out.println("entered correct Adress");
	}
		}
		return false;

	
	}

}
