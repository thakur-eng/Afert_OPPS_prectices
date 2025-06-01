package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListofListToFlatMap {

	public static void main(String[] args) {
 
		List<List<String>> nested = Arrays.asList(Arrays.asList("Ashish","Thakur"),Arrays.asList("Prashant","Kumar"),Arrays.asList("Kishan","Jha"));
		
		List<String> flatList = nested.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatList);
		
		
	}

}
