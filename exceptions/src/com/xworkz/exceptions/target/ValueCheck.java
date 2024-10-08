package com.xworkz.exceptions.target;

public class ValueCheck extends Throwable{

	public ValueCheck(String message) {
		super();
		System.out.println("Entered Message is:"+message);
	}

	public ValueCheck(int i) {
		System.out.println("Entered Value is:"+i);
	}
	
}
