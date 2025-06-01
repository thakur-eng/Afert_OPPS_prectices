package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapSorting {

	public static void main(String[] args) {

		List<List<Integer>> number = Arrays.asList(Arrays.asList(1, 2, 4, 5, 6, 7, 9, 4, 3, 2, 3, 5, 7, 6, 5, 4, 3, 2),
				Arrays.asList(1, 2, 3, 4, 4, 3, 2, 4, 5, 6, 4, 8));

		List<Integer> num = number.stream().flatMap(list -> list.stream()).sorted().collect(Collectors.toList());

		System.out.println("Sorted Number" + num);
	}

}
