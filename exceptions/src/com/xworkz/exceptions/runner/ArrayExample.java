package com.xworkz.exceptions.runner;

public class ArrayExample {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3};
	        try {
	            System.out.println(arr[2]);
	        } finally {
	            System.out.println("Finally block: Cleanup.");
	        }
	    }
	}

