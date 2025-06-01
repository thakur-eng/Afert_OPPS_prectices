//2. Write a Java program to count the number of key-value (size) mappings in a map.
package com.CollectionFremWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Count_The_Number_ofKey_Value_Size {

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
	
	System.out.println(associate.size());
	
	Iterator<Entry<String,Integer>> itr = associate.entrySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}

