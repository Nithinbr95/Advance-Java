package com.xworkz.exceptions.target;

public class ConnectionError extends Exception {
	 public ConnectionError(String message) {
	        super(message);
	    }
	public class SimpleDatabase {
		 
		    public void connect() throws ConnectionError {
		        throw new ConnectionError("Connection failed!");  
		    }
	 }
}
