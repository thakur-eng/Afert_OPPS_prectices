package com.CollectionFremWork;

import java.util.*;
public class ReverseName {

	public static void main(String[] args) {

//		List<Integer> name = new ArrayList<Integer>(Arrays.asList(1,2,4,5,7));
//		Collections.reverse(name);
//		System.out.println( name);
//		
//		List<String> nam = new ArrayList<String>(Arrays.asList("Ashish"));
//		Collections.reverse(name);
//		System.out.println( nam);
		
		List<String> name = new ArrayList<>();
        name.add("AShish");
        name.add("s");
        name.add("h");
        name.add("i");
        name.add("s");
        name.add("h");

        Collections.reverse(name);
        System.out.println(name);
		 

	}

}
