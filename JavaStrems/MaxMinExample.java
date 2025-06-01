package com.JavaStrems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,9,9,4,2,4,6,43,1,5,7,4,2,5,89,05,2,3,6,9);
		
		int max = numbers.stream().max(Comparator.naturalOrder())
				.orElseThrow(() -> new RuntimeException("Empty list"));
		
		int min = numbers.stream().min(Comparator.naturalOrder())
				.orElseThrow(() -> new RuntimeException("Empty list"));
		
		System.out.println("Maximum :" + max);
		System.out.println("Minimum :" + min);
 		
		
		
	}
}