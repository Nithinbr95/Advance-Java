package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.target.SimpleCalc;

public class SimpleCalcRunner {
	public static void main(String[] args) {
        SimpleCalc calc = new SimpleCalc();
        try {
            calc.divide(10, 0);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}
