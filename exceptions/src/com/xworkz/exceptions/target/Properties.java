package com.xworkz.exceptions.target;

public class Properties implements Cloneable {
	public String name;
	public int price;
	public float weight;
	
	@Override
	public Properties clone() throws CloneNotSupportedException {
		System.out.println("CLone method invoking");
		return (Properties)super.clone();
	}

	@Override
	public String toString() {
		return "Properties [name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}
	
	

}
