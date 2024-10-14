package com.xworkz.collections.ruuner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.CollegeDetailsDto;

public class CollegeDetailsRunner {
   public static void main(String[] args) {
	
	   Collection<String>name = new ArrayList<String>();
	   name.add("Reva");
	   name.add("Chaitanya");
	   name.add("Sapthagiri");
	   name.add("Alvas");
	   System.out.println(name);
	   System.out.println(name.size());
	   Collection<String>college = new ArrayList<String>();
	   college.add("Sahyadri");
	   college.add("SJM");
	   name.addAll(college);
	   System.out.println(name);
	   Object[] clg = name.toArray();
	   name.toArray();
	   System.out.println(name);
	   //name.removeAll(name);
//	   System.out.println("After remove");
//	   System.out.println(name);
	   boolean containsSahydri = name.contains("Sahyadri");
	   System.out.println(containsSahydri);
	   boolean containsallname = name.containsAll(college);
	   System.out.println(containsallname);
	   
	   
	
   }
}
