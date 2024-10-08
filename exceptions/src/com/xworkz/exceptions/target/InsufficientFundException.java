package com.xworkz.exceptions.target;

public class InsufficientFundException extends Exception {
	
	 public InsufficientFundException(String message) {
	        super(message);
	        
	 }
	 public void BankAccount(int balance){
		 System.out.println("Minimum Balance is:"+balance);
	 
	 }  
	
}
