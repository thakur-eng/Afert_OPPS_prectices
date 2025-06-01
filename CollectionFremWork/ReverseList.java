package com.CollectionFremWork;

import java.util.*;
public class ReverseList {

	public static void main(String[] args) {
 
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,17,19,20,80,40,78,999));
	
		Collections.reverse(numbers);
		
		System.out.println(numbers);
	}

}

