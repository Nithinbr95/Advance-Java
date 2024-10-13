package com.xworkz.exceptions.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StatesRunner {

	public static void main(String[] args) {
		Collection<String>statenames = new ArrayList<String>();
		statenames.add("Karnataka");
		statenames.add("AP");
		statenames.add("TN");
		statenames.add("Goa");
		statenames.add("New Delhi");
		statenames.add("MadhyaPradesh");
		statenames.add("Gujarat");
		statenames.add("Rajasthan");
		statenames.add("Bihar");
		statenames.add("Assam");
		statenames.add("Arunanchal Pradesh");
		statenames.add("ChattisGhard");
		statenames.add("UP");
		statenames.add("Telagana");
		statenames.add("Odisha");
		statenames.add("Hyderbad");
		statenames.add("JharKhand");
		statenames.add("Mizoram");
		statenames.add("Maharashtra");
		statenames.add("Manipur");
		statenames.add("Nagaland");
		statenames.add("Sikkim");
		statenames.add("Tripura");
		statenames.add("Punjab");
		statenames.add("Meghalaya");
		statenames.add("Himachal Pradesh");
		statenames.add("Harayana");
		statenames.add("Kerala");
		statenames.add("UttarKhand");
		System.out.println(statenames);
		System.out.println(statenames.size());
		ArrayList<String> sortedList = new ArrayList<>(statenames);
        Collections.sort(sortedList);
        
        System.out.println(sortedList);
		

	}

}
