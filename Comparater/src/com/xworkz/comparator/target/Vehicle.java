package com.xworkz.comparator.target;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle implements Comparable<Vehicle> {
 
	private String brand;
	private int model;
	private int topSpeed;
	@Override
	public int compareTo(Vehicle o) {
		if(o.getModel()>this.getModel())
		return 1;
		if(o.getModel()<this.getModel())
			return -1;
		return 0;
	}
	
}