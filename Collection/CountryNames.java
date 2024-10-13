package com.xworkz.exceptions.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CountryNames {

		public static void main(String[] args) {
			Collection<String>countrynames = new ArrayList<String>();
			countrynames.add("India");
			countrynames.add("Europe");
			countrynames.add("Australia");
			countrynames.add("Japan");
			countrynames.add("Malaysia");
			countrynames.add("Russia");
			countrynames.add("Buthan");
			countrynames.add("Noida");
			countrynames.add("America");
			countrynames.add("USA");
			countrynames.add("France");
			countrynames.add("Singapore");
			countrynames.add("Colombia");
			countrynames.add("Mongolia");
			countrynames.add("South Africa");
			countrynames.add("Afghanisthan");
			countrynames.add("Brazil");
			countrynames.add("Vatican City");
			countrynames.add("Brazil");
			countrynames.add("Germany");
			System.out.println(countrynames);
			System.out.println(countrynames.size());
			ArrayList<String>sortedlist =new ArrayList<>(countrynames);
			Collections.sort(sortedlist);
			System.out.println(sortedlist);

		}

	


}
