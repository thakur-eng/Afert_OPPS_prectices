package com.JavaStrems;

import java.util.Map;
import java.util.stream.Collectors;

public class String_Frequency_Count {

	public static void main(String[] args) {
 
		String name = "Hypapotatmuso";
		
		Map<Character, Long> freqMap = name.chars()
				.mapToObj(c ->(char)c)
				.collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	
		System.out.println(freqMap);
		
	}

}
