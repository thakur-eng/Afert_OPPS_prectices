package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedStream {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1,3,2,4,5,643,2,5,8,2,6,4,2,8,32);
		
		Stream<Integer> num = number.stream();
		
		Stream<Integer> numb = num.sorted();
		
		List<Integer> output = numb.collect(Collectors.toList());
		System.out.println(output);
		
	}
}
