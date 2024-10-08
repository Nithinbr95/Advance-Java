package com.xworkz.javaProject.runner;

import com.xworkz.javaProject.dto.PersonDetailsDto;
import com.xworkz.javaProject.service.AbstractPersonInformation;
import com.xworkz.javaProject.service.GaneshInformation;
import com.xworkz.javaProject.service.NithinInformation;

public class PersonDetailsRunner {
	
public static void main(String[] args) {
	
	PersonDetailsDto details = new PersonDetailsDto();
	details.setName("Nithin");
	details.setAge(23);
	details.setContactNo(9593487383l);
	details.setAddress("Bengalure");
	
	AbstractPersonInformation info = new NithinInformation();
	
	info.validatePersonDetailsDto(details);
	 info = new GaneshInformation();
	 info.validatePersonDetailsDto(details);
}
}
