package com.xworkz.comparator.dto;

import java.util.Comparator;

import com.xworkz.comparator.target.Books;

public class AuthorDto implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {
		return o1.getAuthor().compareToIgnoreCase(o2.getAuthor());
	}

}
