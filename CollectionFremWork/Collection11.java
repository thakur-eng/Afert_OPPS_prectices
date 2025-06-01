package com.CollectionFremWork;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection11 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Ashish");
		list.add("Rishav");
		list.add("Suraj");
		list.add("Ashish");

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
