package com.JavaStrems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStreamDemo {

	public static void main(String[] args) {

		List<Integer> list = List.of(1,2,3,4,5);
		list.stream().filter(n ->n%2 == 0).forEach(System.out::println);
		
		Stream<Integer> con = list.stream();
		
		Stream<Integer> tra=con.filter(n ->n%2==0);
		
		List<Integer> fin = tra.collect(Collectors.toList());
		
		System.out.println(fin);
		
	}

}
