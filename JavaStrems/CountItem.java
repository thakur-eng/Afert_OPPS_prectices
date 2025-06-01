package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountItem {

	public static void main(String[] args) {


		List<Integer> item = Arrays.asList(1,3,2,4,6,3,7,3,7,3);
		
		Stream<Integer> count = item.stream();
		 
		long counts = count.count();
		
		System.out.println(counts );
		
	}
	

}
