package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "Python", "C++", "Go");

		String result = list.stream().collect(Collectors.joining(", "));

		System.out.println(result);

	}
}
