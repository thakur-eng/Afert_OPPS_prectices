package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountString {

	public static void main(String[] args) {

		String s1 = "This is KodeWala and we are located in BTM Banglore . We are providing It consulting and Software trening . i am getting trained heare";

		 

		String arr[] = s1.split(" ");

		List<String> list = Arrays.asList(arr);

		Stream<String> sentence = list.stream();

		Stream<String> filters = sentence.filter(n -> n.length() > 2).map(n -> n.toUpperCase());

		long counts = filters.count();
		System.out.println(counts);

		List<String> output = filters.collect(Collectors.toList());
		System.out.println(output);
 
		
//		String s6="12232";
//		 
//		int a =Integer.valueOf(s6);
//		
//		System.out.println(a);
//		 if(a>10) {
//			 System.out.println("THIS IS THE INTEGER");
//		 }

		 
	}

}
