package com.xworkz.comparator.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparator.target.Vehicle;

public class VehicleRunner{
	
	public static void main(String[] args) {
		List<Vehicle>list = new ArrayList<Vehicle>();
		list.add(new Vehicle("Benz", 2020, 120));
		list.add(new Vehicle("Maruthi", 2023, 140));
		//Comparable<Vehicle>vehicle = new Comparable<Vehicle>(); 
			System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}