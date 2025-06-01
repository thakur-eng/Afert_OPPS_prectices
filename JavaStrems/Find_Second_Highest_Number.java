package com.JavaStrems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_Second_Highest_Number {

	public static void main(String[] args) {
 
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,7,8,9,91,10,102);
	  Integer secondHighest = nums.stream()
			  .distinct()
			  .sorted(Comparator.reverseOrder())
			  .skip(1)
			  .findFirst()
			  .orElse(null);
	  
	  System.out.println("Scond highest :" + secondHighest);
	
	}

}
