package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,3,5,1,4,2,5,5,63,2,6,3);
		
		Stream<Integer> num = nums.stream();
				
		Stream<Integer> number =	num.distinct();
				List<Integer> finalnum = number.collect(Collectors.toList());
		
		System.out.println(finalnum);
	}

}
