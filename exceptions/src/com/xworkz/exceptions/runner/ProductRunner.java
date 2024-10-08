package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.target.Product;

public class ProductRunner {
 public static void main(String[] args) {
	 Product product = new Product();
	 product.prodname = "Earbuds";
	 product.brand = "Boat";
	 product.price = 1200;
	 product.madein ="India";
	 product.rating = 8;
	 product.chargeCapacity = 7;
	 product.chargerType = "Type-C";
	 product.weight = 25f;
	 System.out.println(product);
	 try {
		 Product product1 = product.clone();
		 product1.prodname = "Earbuds";
		 product1.brand = "Noise";
		 product1.price = 1500;
		 product1.madein ="India";
		 product1.rating = 9;
		 product1.chargeCapacity = 10;
		 product1.chargerType = "Type-C";
		 product1.weight = 20f;
		 System.out.println(product1);
	 }catch(CloneNotSupportedException e) {
		 e.printStackTrace();
	 }
}
}
