package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.target.ValueCheck;

public class CheckRunner {
public static void main(String[] args) {
	 ValueCheck values = new ValueCheck(5);
	
	    
	        try {
	            int value = -5;
				if (value < 0) {
	                // Raise the user-defined exception
	                throw new ValueCheck("Value cannot be negative!");
	            } else {
	                System.out.println("Value is valid: " + value);
	            }
	        } catch (ValueCheck e) {
	            // Catch and handle the custom exception
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    
	    
	}

}

