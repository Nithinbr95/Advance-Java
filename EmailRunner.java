package com.xworkz.collections.runner;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EmailRunner {

	public static void main(String[] args) {
		List<String>email = new LinkedList<String>();
		email.add("mallika@gmail.com");
		email.add("ganeshi@gmail.com");
		ListIterator<String>emails = email.listIterator();
		emails.add("rajeshwari@gmail.com");
		emails.add("nithu@gmail.com");
		System.out.println("Next Element is:"+emails.hasNext());
		System.out.println("Previous Element id:"+emails.previous());
		int result = emails.nextIndex();
		System.out.println("Index Value is:"+result);
		email.remove(0);
		email.forEach(s->System.out.println(s));
		System.out.println(email.contains("prajwala@gmail.com"));
		email.add(1,"tasmo@gmail.com");
		email.forEach(s->System.out.println(s));
		
		
	}
}
