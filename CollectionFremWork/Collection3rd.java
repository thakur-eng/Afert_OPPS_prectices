package com.CollectionFremWork;

import java.util.*;

public class Collection3rd {

	public static void main(String[] args) {

		// Creating a List using ArrayList (List is an interface, ArrayList is a class)

		List<String> fruts = new ArrayList<>();

		// Adding elements to the list
		fruts.add("Apple");
		fruts.add("Mango");
		fruts.add("Banana");
		fruts.add("Orange");
		fruts.add("Coconet");
		fruts.add("Papaya");

		// Printing the list
		System.out.println("Fruits  List :-" + fruts);

		// Accessing elements
		System.out.println("First fruits  :" + fruts.getFirst());

		System.out.println("Fourth fruits  :" + fruts.get(3));

		// Iterating through the list

		System.out.println("All fruits  ");

		for (String fritus : fruts) {
			System.out.println(fritus);
		}

		// Removing an element
		fruts.remove("Orange");

		System.out.println("After Removing fruits  " + fruts);

	}

}
