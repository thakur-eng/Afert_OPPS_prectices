package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TasksInput {

	public static void main(String[] args) {

		List<String> inputList = Arrays.asList("This", " is", " Kodewala ", " is", "Banglore", " we", "Banglore",
				" are", " into", " in ", " into", " consulting ", "and", " training", "This");

//				
//				String s2 =s1.stream()
//				.filter(n -> n.length() > 3)
//				.map(i -> i.toUpperCase())
//              .collect(Collectors.joining(", "));

//		            long s2 = s1.stream()
//			       .filter(n -> n.contains("e"))
//				   .count();

		// String s3 = "asdfg fdaa";
		
		

		Map<Object, Long> s2 = inputList.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		s2.forEach((n,m) -> System.out.println(n +" --- " +m));
		
		//System.out.println(s2);

	}

}

//String a =" ass  aaa ddd aa" 
//Arrays.strim(input.split(" ")).