package com.xworkz.exceptions.target;

import com.xworkz.exceptions.target.ConnectionError.SimpleDatabase;

public class ConnectioErrorRunner {
	 public static void main(String[] args) {
	     SimpleDatabase db = new SimpleDatabase();
	        try {
	            db.connect(); 
	        } catch (ConnectionError e) {
	            System.out.println("Caught exception: " + e.getMessage());
	        } finally {
	            System.out.println("Finally block: Closing resources.");
	        }
	 }
}
