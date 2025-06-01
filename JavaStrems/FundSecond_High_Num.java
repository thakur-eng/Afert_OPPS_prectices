package com.JavaStrems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FundSecond_High_Num {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,7,8,9,91,10,102);
		
		
		  Optional<Integer> secondHighest = nums.parallelStream()
				  .sorted(Comparator.reverseOrder())
				  .skip(1)
				  .findFirst();
				 // .orElse(null);
		  
		  System.out.println(secondHighest);
	}

}
