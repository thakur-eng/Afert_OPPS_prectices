package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOdd {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Stream<Integer> oddNum = num.stream();

		Stream<Integer> filterodd = oddNum.filter(n -> n % 2 == 0);

		List<Integer> finaloutput = filterodd.collect(Collectors.toList());

		System.out.println(num);
		System.out.println(finaloutput);

	}
}