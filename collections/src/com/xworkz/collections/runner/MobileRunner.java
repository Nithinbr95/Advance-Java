package com.xworkz.collections.runner;

import java.util.LinkedList;
import java.util.List;

public class MobileRunner {

	public static void main(String[] args) {
		List<String>name = new LinkedList<String>();
		name.add("Samsung");
		name.add("Realme");
		name.add("Iphone");
		name.add("Vivo");
		System.out.println(name);
		name.add(0, "Redmi");
		System.out.println(name);
		List<String>names = new LinkedList<String>();
		names.add("Poco");
		names.add("Infinix");
        names.add("OnePlus");
        System.out.println(names);
        name.addAll(names);
        System.out.println("After add all method");
        System.out.println(name);
        System.out.println("After add all index basemethod");
        name.addAll(2, names);
        System.out.println(name);
        name.contains(name);
        System.out.println("Contains");
        System.out.println(name);
        names.containsAll(name);
        System.out.println("Contains All");
        name.forEach(s->System.out.println(s));
        name.equals(names);
        System.out.println(name);
         name.get(4);
        System.out.println("Get function");
        System.out.println(name);
        name.getClass();
        System.out.println(name);
        name.indexOf("Vivo");
        System.out.println(name.indexOf("Poco"));
        
        name.lastIndexOf(name);
        System.out.println("LastIndex Of");
        System.out.println(name.lastIndexOf("Vivo"));
        name.remove(2);
        System.out.println(name);
        name.remove("Vivo");
        System.out.println(name);
        //name.toArray();
        System.out.println(name.toArray());
        //name.subList(2, 4);
        System.out.println(name.subList(0, 3));
        //name.size();
        System.out.println(name.size());
        name.clear();
        System.out.println(name);
        name.removeAll(name);
        System.out.println(name);
        
	}

}
