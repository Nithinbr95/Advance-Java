package com.xworkz.exceptions.target;

import java.time.LocalDateTime;

public class Items implements Cloneable {
 
	public String name;
	public int price;
	public double rating;
	public String brand;
	public float quantity;
	public LocalDateTime manfacdate;
	public LocalDateTime expDate;
	public String madein;

	@Override
	public Items clone() throws CloneNotSupportedException {
		System.out.println("Items clone method invoking");
		return (Items)super.clone();
		
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", price=" + price + ", rating=" + rating + ", brand=" + brand + ", quantity="
				+ quantity + ", manfacdate=" + manfacdate + ", expDate=" + expDate + ", madein=" + madein + "]";
	}
	
}
