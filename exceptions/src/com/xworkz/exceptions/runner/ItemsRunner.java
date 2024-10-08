package com.xworkz.exceptions.runner;

import java.time.LocalDateTime;

import com.xworkz.exceptions.target.Items;

public class ItemsRunner {
public static void main(String[] args) {
	Items item = new Items();
	item.name = "Rice";
	item.brand = "Bullet";
	item.price = 1000;
	item.quantity = 25f;
	item.rating = 6;
	item.madein = "india";
	item.manfacdate = LocalDateTime.now();
	item.expDate = LocalDateTime.MAX;
	System.out.println(item);
	try {
		Items item1 = item.clone();
		item1 = item;
		System.out.println(item1);
	}
	catch(CloneNotSupportedException e){
		e.printStackTrace();
	}
}
}
