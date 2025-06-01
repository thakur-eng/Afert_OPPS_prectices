package com.CollectionFremWork;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
 
		List<String> linklist = new LinkedList<>();
		
		linklist.add("Sony");
		linklist.add("Vivo");
		linklist.add("Mi");
		linklist.add(2, "Apple");
		linklist.add("Realme");
		linklist.add(0, "GooglePixal");
		
		System.out.println(linklist);

		
		System.out.println(linklist.get(3));
		
		System.out.println(linklist.get(0));

		System.out.println(linklist.get(5));

	}

}
