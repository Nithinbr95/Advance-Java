package com.xworkz.exceptions.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MoviesRunner {
	    public static void main(String[] args) {
	        Collection<String> movies = new ArrayList<String>();
	        movies.add("MasterPiece");
	        movies.add("RajaHuli");
	        movies.add("Kantara");
	        movies.add("KGF");
	        movies.add("Toxic");
	        movies.add("Martin");
	        movies.add("Koti");
	            System.out.println(movies);
	            ArrayList<String>sortedlist = new ArrayList<>(movies);
	            Collections.sort(sortedlist);
	            System.out.println(sortedlist);
	        }
	    }
	

