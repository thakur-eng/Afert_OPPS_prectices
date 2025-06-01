package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten_Lists {

	public static void main(String[] args) {
 
		List<List<String>> listoflists = Arrays.asList(Arrays.asList("a","b"), Arrays.asList("c","d"),Arrays.asList("e","f"));
	
		
		List<String> flatList = listoflists.stream().flatMap(List::stream).collect(Collectors.toList());
	
	    System.out.println(flatList);
	}

}
