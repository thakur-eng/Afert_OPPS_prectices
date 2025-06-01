package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapAllElementExamp {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Ashish", "Thakur");

		List<String> flatMapped = words.stream().flatMap(word -> Arrays.stream(word.split("")))
				.collect(Collectors.toList());
	System.out.println(flatMapped);
	}
	

}
