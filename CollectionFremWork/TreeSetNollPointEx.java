package com.CollectionFremWork;

import java.util.TreeSet;

public class TreeSetNollPointEx {

	public static void main(String[] args)

	{

//		TreeSet<String> name = new TreeSet<String>();
//
//		name.add("Ashish");
//		name.add(null);
//		name.add(null);
//		System.out.println(name);     // NullPointException if a single null value in TreeSet

		TreeSet<Integer> num = new TreeSet<Integer>();

		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);

		System.out.println(num); // ascending order

		System.out.println(num.reversed()); // descending order

	}
}
