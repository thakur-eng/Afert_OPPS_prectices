//1. Write a Java program to associate the specified value with the specified key in a HashMap.

package com.CollectionFremWork;

import java.util.*;
import java.util.Map.Entry;
public class Associate_specified_Value_with_specified_key {

	public static void main(String[] args) {
		
		Map<String,Integer> associate= new HashMap<>();
		
		associate.put("Amandeep", 2020432);
		associate.put("Praksh", 2022132);
		associate.put("Archana", 2024832);
		associate.put("Mukesh", 2028132);
		associate.put("Aman", 2025990);
		associate.put("Raja", 2022897);
		associate.put("Pankaj", 2022979);
		associate.put("Prashant", 2029632);
		associate.put("Ashish", 2010667);
		associate.put("Abhishek", 2023887);
		associate.put("Nilu jain ", 2025878);
		
		System.out.println(associate);
		
		Iterator<Entry<String,Integer>>  asso = associate.entrySet().iterator();
		while(asso.hasNext())
		{
			Entry<String,Integer> emp =asso.next();
			//System.out.println(asso.next());
			
			System.out.println("Associate name :-"+emp.getKey() +"||Associate ID:-"+ emp.getValue());
		}
		
		
		

	}

}
