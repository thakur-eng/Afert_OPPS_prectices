package com.CollectionFremWork;

import java.util.*;

public class FailFatExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Ashish");
		list.add("Suresh");

		for (String str : list) {
			System.out.println(list);
			list.add("Prashant"); 
		}

	} 

}
