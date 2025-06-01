package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountExample {

	public static void main(String[] args) {
 
		List<String> name = Arrays.asList("Ashish","Kuldeep","Prashant","Pushaker","Kishan","Abhishek","Tejas","Rishav","Pravin","kantaram");
		
		//long naam = name.stream().count();
		
		long naam = name.stream().filter(nam -> nam    .startsWith("A")).count();
		
		 System.out.println("Start with A name is :- "+naam);
		
		
	}

}
