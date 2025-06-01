package com.CollectionFremWork;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> name = new TreeSet<>();
		name.add("Ashish");
		name.add("Abhishek");
		name.add("Prashant");

		System.out.println("Name : " + name);

//		for (String s : name) {
//
//			System.out.println("Name : " + s);
//		}

		Iterator<String> itr = name.iterator();
		while(itr.hasNext())
		{System.out.println(itr.next());}
 
	}
}
