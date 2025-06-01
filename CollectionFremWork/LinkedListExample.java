package com.CollectionFremWork;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> products = new LinkedList<>();
		
		products.addLast("something");

		products.add("Sumsung");

		products.add("Realme");

		products.addFirst("this is new");

		products.add("Mobile Phone");

		System.out.println("After addLast: " + products);

		System.out.println("All mobile Phone Brands : " + products);

		products.remove("Mobile Phone");

		System.out.println("After removing All mobile Phone Brands : " + products);
     
	}
}
