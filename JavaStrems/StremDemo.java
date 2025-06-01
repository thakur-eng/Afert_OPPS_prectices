package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremDemo {

	public static void main(String[] args) {
    
		List<Integer> num= Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> stream = num.stream();
		
		Stream<Integer> outputmap = stream.filter(n ->n%2!=0);
				
		List<Integer>  Output = outputmap.collect(Collectors.toList());
				
				System.out.println(Output);
		
		
	}

}
