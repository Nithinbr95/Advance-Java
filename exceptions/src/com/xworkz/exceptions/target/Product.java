package com.xworkz.exceptions.target;



public class Product implements Cloneable {

	public String prodname;
	public int price;
	public double rating;
	public String brand;
	public float weight;
	public int chargeCapacity ;
	public String chargerType;
	public String madein;
	
@Override
	public Product clone() throws CloneNotSupportedException {
	System.out.println("Shallow method invoking");
	return (Product)super.clone();
}

@Override
public String toString() {
	return "Product [prodname=" + prodname + ", price=" + price + ", rating=" + rating + ", brand=" + brand
			+ ", weight=" + weight + ", chargeCapacity=" + chargeCapacity + ", chargerType=" + chargerType + ", madein="
			+ madein + "]";
}



}
