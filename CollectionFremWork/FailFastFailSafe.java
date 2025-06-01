package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

	public static void main(String[] args) {

		List<String> name = new ArrayList<>();
		name.add("AShish");
		name.add("Shub");
		name.add("Ramanan");
		name.add("Mohit");

//		System.out.println(name);
//		Iterator<String> itr = name.iterator();
//		while (itr.hasNext()) {
//			String el = itr.next();
//			// name.add("name");
//			System.out.println(el);
//			
//		}
//
//		System.out.println("------------------");

		CopyOnWriteArrayList<String> name1 = new CopyOnWriteArrayList<>();

		name1.add("Shub");
		name1.add("Ramanan");
		name1.add("Mohit");

		Iterator<String> itr1 = name1.iterator();
		while (itr1.hasNext()) {
		    System.out.println(itr1.next());
			name1.add("Ashish Thakur");
//			list.add("Prashant jii");
//			list.add("Rishav jii");
			System.out.println(name1);
		}

	}

}
