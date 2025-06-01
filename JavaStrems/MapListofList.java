package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapListofList {

	public static void main(String[] args) {
 
		List<String> words = Arrays.asList("Hellow", "World");
		
		List<List<String>> mapped = words.stream()
        .map(word -> Arrays.asList(word.split("")))
        .collect(Collectors.toList());
		System.out.println(mapped);
	
	}

}
