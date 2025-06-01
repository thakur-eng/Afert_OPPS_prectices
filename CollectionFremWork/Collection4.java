package com.CollectionFremWork;

import java.util.*;  // Importing Collection Framework

public class Collection4 {
	
	
	    public static void main(String[] args) {
	        // Creating a Set using HashSet (Set is an interface, HashSet is a class)
	        Set<String> colors = new HashSet<>();

	        // Adding elements to the set
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Red");  // Duplicate, won't be added

	        // Printing the set
	        System.out.println("Colors Set: " + colors);

	        // Checking if a color exists
	        System.out.println("Contains Green? " + colors.contains("Green"));

	        // Iterating through the set
	        System.out.println("All colors:");
	        for (String color : colors) {
	            System.out.println(color);
	        }

	        // Removing an element
	        colors.remove("Green");
	        System.out.println("After removing Green: " + colors);
	    }
	}
