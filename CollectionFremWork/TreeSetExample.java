package com.CollectionFremWork;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<Integer> number = new TreeSet<Integer>();
		number.add(101);
		number.add(201);
		number.add(301);
		number.add(405);
		number.add(505);
		number.add(600);
		number.add(110);
		number.add(101);
		number.add(220);

		System.out.println(number);

		Set<String> name = new TreeSet<String>();

		name.add("Ashish");
		name.add("Prashant");
		name.add("Ritesh");
		name.add("Dheraj");
		name.add("Rishav");
		name.add("Ujawal");
		name.add("Shiv");
		name.add("Abhishek");
		name.add("Amit");

		System.out.println(name);

		Iterator<Integer> ite = number.iterator();
		while (ite.hasNext()) {
			System.out.println("Use Iterator Location : " + ite.next());

		}
		Iterator<String> itr = name.iterator();

		while (itr.hasNext()) {
			System.out.println("Use Iterator Name : " + itr.next());

		}
	}
}
