package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {

	public static void main(String[] args) {

		// List<String> list = new ArrayList<String>();
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

		list.add("Ashish");
		list.add("Prashant");
		list.add("Ramanuj");

		for (String name : list) {
			System.out.println(name);
			list.add("C");
		}
		System.out.println("Final List: " + list);

	}

}
