package com.JavaStrems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamDemo {

	public static void main(String[] args) {

		List<String> list = List.of("Ashish", "Kishan", "Prashant");

		Stream<String> name= list.stream();
		
		Stream<String> nam =name.map(n ->n.trim());
		
		List<String> output = nam.collect(Collectors.toList());
		
		System.out.println(output);
		
		
		list.stream().sorted().forEach(System.out::println);

	}

}
