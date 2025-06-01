package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMixExample {

	public static void main(String[] args) 
	{
		
		List<String> name = Arrays.asList("Ashish","Kuldeep","Prashant","Pushaker","Kishan","Abhishek","Tejas","Rishav","Pravin","kantaram");

		List<String> result = name.stream()
				.filter(nam -> nam.startsWith("A"))
				.map(n-> n.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
