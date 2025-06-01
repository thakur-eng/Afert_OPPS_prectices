package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {
 
		List<String> list = new ArrayList<String>();
		list.add("Papaya");
		list.add("Guava");
		list.add("Ducker");
		list.add(3, null);
		list.add("Apple");
		list.add(5, "Microman");
		list.add("Mango");
		

		System.out.println(list);
		
		for(String s :list) {
			System.out.println(s);
			list.add("a");
		}
	}

}
