package com.CollectionFremWork;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemoI {

	public static void main(String[] args) {

		TreeSet<Integer> age = new TreeSet<>();
		age.add(25);
		age.add(27);
		age.add(24);
		System.out.println("Age : " + age);

		for (Integer i : age) {
			System.out.println(" Age : " + i);
		}
		
		Iterator<Integer> itr =age.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
