package com.xworkz.exceptions.runner;

import java.util.Scanner;

public class FileReader  {
	
	    public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.println("Enter the name");
	            sc.nextInt();
	        }
	    }
	}

