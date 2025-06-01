package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ashish");
		list.add("KodeWala");

		Iterator itr = list.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
