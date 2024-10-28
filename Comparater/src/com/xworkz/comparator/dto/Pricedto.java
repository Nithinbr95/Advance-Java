package com.xworkz.comparator.dto;

import java.util.Comparator;

import com.xworkz.comparator.target.Books;

public class Pricedto  implements Comparator<Books> {

		@Override
		public int compare(Books o1, Books o2) {
			
			return Integer.compare(o2.getPrice(), o1.getPrice());
		}

	}

