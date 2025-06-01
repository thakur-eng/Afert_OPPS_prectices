package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitFirst_N_numver_element {

	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Kolkata","Bhubneswar","Bengloru","Chanai","mumbai");
		
		Stream<String> citi = cities.stream();
		
		Stream<String> citis= citi.limit(2);
		
		List<String> town = citis.collect(Collectors.toList());
		
		System.out.println(town);
		
	}

}
