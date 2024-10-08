package com.xworkz.exceptions.target;

public class SimpleCalc {
	public void divide(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Values cannot be negative!");
        } else if (b == 0) {
            throw new Exception("Cannot divide by zero!");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
}
