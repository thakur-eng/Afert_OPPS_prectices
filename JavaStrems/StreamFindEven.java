package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFindEven {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1, 3, 4, 2, 5, 7, 6, 9, 5, 8, 4, 3, 22, 55, 66, 12, 35, 97);

		Stream<Integer> convertstream = number.stream();

		Stream<Integer> doopration = convertstream.filter(n -> n % 2 == 0);

		List<Integer> convertcollection = doopration.collect(Collectors.toList());

		System.out.println("Output in Collection " + convertcollection);
	}

}
