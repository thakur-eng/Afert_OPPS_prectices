package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition_EvenAndOddNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2,4,5,6,8,9,5,12,32,4,6,1,7,18,93);
	
	Map<Boolean , List<Integer>> partition = numbers.stream().collect(Collectors.partitioningBy(num -> num%2 == 0 ));
	
	System.out.println(partition);
	
	System.out.println("Even Number :" + partition.get(true));
	System.out.println("Odd Number :" + partition.get(false));

	
	
//	Quick Explanation:
//		.partitioningBy(predicate) splits the stream into two groups:
//
//		true ➔ satisfies the condition (even numbers).
//
//		false ➔ does not satisfy (odd numbers).
	
	}

}
