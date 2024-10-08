package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.target.Properties;

public class ExceptionRunner {
	
public static void main(String[] args) {
	Properties properties = new Properties();
	properties.name = "Laptop";
	properties.price = 900000;
	properties.weight = 2000f;
	System.out.println("properties are:"+properties);
	
	try {
		Properties properties1 = properties.clone();
		properties1.name = "Mobile";
		properties1.price = 20000;
		properties1.weight = 20f;
		properties1.name = properties.name;
		properties1.price = properties.price;
		System.out.println("after Properties:"+properties1);
	}
	catch(CloneNotSupportedException e){
		e.printStackTrace();
		
	}
}
}
