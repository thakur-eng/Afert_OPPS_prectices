package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);

		Stream<Integer> strem = num.stream();
		
		Stream<Integer> stremmap = strem.map(n-> n*10);
		
		List<Integer> stremmapoutput = stremmap.collect(Collectors.toList());
		
		System.out.println(stremmapoutput);
		
	}

}
