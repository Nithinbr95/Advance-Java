package com.xworkz.comparator.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparator.dto.AuthorDto;
import com.xworkz.comparator.dto.Pricedto;
import com.xworkz.comparator.target.Books;

public class BooksRunner {

	public static void main(String[] args) {
		List<Books> books = new ArrayList<Books>();
        books.add(new Books("Parva", "Bhyrappa", 1000));
        books.add(new Books("Grihabanga", "Bhyrappa", 700));
        books.add(new Books("karvalo", "Tejaswi", 100));
        books.add(new Books("Malegalali Madumagalu", "Kuvempu", 899));
        System.out.println("price based list");
        Collections.sort(books, new Pricedto());
        System.out.println(books);
        System.out.println("author based list ");
        Collections.sort(books, new AuthorDto());
        System.out.println(books);

	
	}
	
}
