package com.xworkz.collections.runner;

import java.util.LinkedList;
import java.util.List;
public class Brands {

		public static void main(String[] args) {
			LinkedList<String>brands = new LinkedList<String>();
			brands.add("Zudio");
			brands.add("Puma");
			brands.add("Levis");
			brands.add("Polo");
			System.out.println(brands);
			brands.add(0, "Ramraj");
			System.out.println(brands);
			LinkedList<String>brand = new LinkedList<String>();
			brand.add("Uniqlo ");
			brand.add("Hanes");
			brand.add("Fabindia");
	        System.out.println(brand);
	        brands.addAll(brand);
	        System.out.println("After add all method");
	        System.out.println(brands);
//	        System.out.println("After add all index basemethod");
//	        brands.addAll(2, brands);
//	        System.out.println(brands);
//	        brands.contains(brands);
//	        System.out.println("Contains");
//	        System.out.println(brands);
//	        brands.containsAll(brands);
//	        System.out.println("Contains All");
//	        brands.forEach(s->System.out.println(s));
//	        brands.equals(brands);
//	        System.out.println(brands);
//	        brands.get(4);
//	        System.out.println("Get function");
//	        System.out.println(brands);
//	        brands.getClass();
//	        System.out.println(brands);
//	        brands.indexOf("Fabindia ");
//	        System.out.println(brands.indexOf("Polo"));
//	        
//	        brands.lastIndexOf(brands);
//	        System.out.println("LastIndex Of");
//	        System.out.println(brands.lastIndexOf("Fabindia"));
//	        brands.remove(2);
//	        System.out.println(brands);
//	        brands.remove("Vivo");
//	        System.out.println(brands);
//	        
//	        System.out.println(brands.toArray());
//	        
//	        System.out.println(brands.subList(0, 3));
//	       
//	        System.out.println(brands.size());
//	        //brands.clear();
//	        //System.out.println(brands);
//	        //brands.removeAll(brand);
//	        //System.out.println(brands);
//	        brands.peek();
            brands.forEach(s->System.out.println(s));
//	        brands.peekFirst();
	        System.out.println(brands.peekFirst());
	        System.out.println("Peek last");
	        System.out.println(brands.peekLast());
	        System.out.println(brands.poll());
	        System.out.println(brands.pollFirst());
	        System.out.println(brands.pollLast());
		}

	}


