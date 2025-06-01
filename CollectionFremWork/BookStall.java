package com.CollectionFremWork;

import java.util.ArrayList;

public class BookStall {

	public static void main(String[] args) {
 
		ArrayList<String> book = new ArrayList<String>();
		book.add("English");
		book.add("Math");
		book.add("Science");
		book.add(2,"SocalScience");
		
		System.out.println("Book Stall "+ book.get(0));

		System.out.println("Book Stall "+ book.get(1));
 
		System.out.println("Book Stall "+ book.get(2));

		System.out.println("Book Stall "+ book.getFirst());
		
		System.out.println("Book Stall " + book.getLast());
	} 
  
}
