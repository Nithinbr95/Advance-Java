package com.xworkz.javaProject.runner;

import com.xworkz.javaProject.target.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		System.out.println("Array Length is:"+mobile.arrayLength());
		String mob = mobile.onSave("Realme");
		mobile.onSave("Samsung");
		mobile.onSave("Iphone");
		mobile.onSave("Poco");
		mobile.readArray();
		mobile.update("Poco", "Vivo");
		mobile.readArray();
		
		mobile.delete("Samsung");
		mobile.readArray();
		
	}

}
