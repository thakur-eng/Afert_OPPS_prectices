package com.CollectionFremWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> bookshop = new HashMap<>();

		bookshop.put("Math", 459);
		bookshop.put("Science", 399);
		bookshop.put("English", 199);
		bookshop.put("Hindi", 140);
		bookshop.put("Physics", 320);
		bookshop.put("Biologoy", 235);
		bookshop.put("SocalScience", 85);
		bookshop.put("History", 75);
		bookshop.put("Java", 255);
		bookshop.put("Python", 242);
		bookshop.put("Sql", 59);
		bookshop.put("Adv java", 599);

		System.out.println(bookshop);

		System.out.println(bookshop.get("Java"));
		System.out.println(bookshop.get("Sql"));

		
		
		Iterator<Entry<String,Integer>> itr =bookshop.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<String,Integer> entry = itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
			
			//System.out.println("Direct Way "+itr.next());
		}
		 	
		
		
		
		Iterator<Entry<String ,Integer>> itor = bookshop.entrySet().iterator();
		while(itor.hasNext())
		{
			System.out.println(itor.next());
		}
	}

}
