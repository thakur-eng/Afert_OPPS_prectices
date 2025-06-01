package com.CollectionFremWork;

import java.util.*;

public class ConvertArrayList {

	public static void main(String[] args) {

		Integer arr[] = { 10, 30, 20, 50, 40, 60 };
		String abb[] = { "aa", "ss", "hh", "ii", "ss", "hh" };
		List<Integer> number = new ArrayList<>(Arrays.asList(arr));
		List<String> list = new ArrayList<>(Arrays.asList(abb));
		System.out.println(number);
		System.out.println(list);

	}
}

