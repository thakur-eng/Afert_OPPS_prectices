package com.CollectionFremWork;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
     Set<String> name = new LinkedHashSet<>();
     name.add("Ashish");
     name.add("Kishor");
     name.add("Ramanuj");
     name.add("Kishor");
     name.add("Ashish");
     name.add("Prashant ");
  
   
     
     
     
     Iterator<String> ite = name.iterator();
    while(ite.hasNext())
    {
    	String element = ite.next();
    			System.out.println(element);
    			
//    	 System.out.println(ite.next());
//    	 name.add("Dheraj");
    }
     
     
//     
//    for(String str:name)
//    {
//    	System.out.println(str);
//    }
    
	}
}
