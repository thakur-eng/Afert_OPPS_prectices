package com.CollectionFremWork;

import java.util.ArrayList;

public class VantaraZoo {

	public static void main(String[] args) {

		ArrayList<String> animals = new ArrayList<String>();

		animals.add(0, "Elephent");
		animals.add(2, "Tiger");
		animals.add("eagle");
		animals.add("Pickoke");
		animals.add("Bald eagle");
		animals.add(3, "Tiger");

		System.out.println(animals.get(0));
		System.out.println(animals.get(1));
		System.out.println(animals.get(2));
		System.out.println(animals.get(4));
		System.out.println(animals.get(3));
		System.out.println(animals.get(5));

	}

}
