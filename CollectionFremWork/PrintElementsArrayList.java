package com.CollectionFremWork;

import java.util.ArrayList;
import java.util.List;

public class PrintElementsArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add("J");
		list.add("K");
		list.add("L");
		list.add("N");
		list.add("O");
		list.add("P");
		list.add("Q");
		
		System.out.println(list);
		
		for(String str : list)
		{
			System.out.println(str);
		}

	}

}
