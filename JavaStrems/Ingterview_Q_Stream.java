package com.JavaStrems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ingterview_Q_Stream {

	public static void main(String[] args) {

		//1. Find all even numbers from a list
		
		List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,7,8,6,5,4,2);
		List<Integer> evenNumber = list.stream().filter(n -> n % 2 ==0).collect(Collectors.toList());
		System.out.println(evenNumber);
		
		//2. Count frequency of each character in a string
		
		 String str = "Ashish Thakur  Thakur Ashish Kodewala ";
		 

	        Map<Character, Long> freq = str.chars()   // create an IntStream of characters
	            .mapToObj(c -> (char) c)              // convert int to Character
	            .collect(Collectors.groupingBy(       // group by character
	                c -> c,                           // key: character itself
	                Collectors.counting()             // value: number of times it appears
	            ));
	        System.out.println(freq);
	        
	      // 3. Remove duplicates from a list
	        
	        List<String> ch = Arrays.asList("a","vv","w","A","a","e","w","q","t","vv","g"); 
		    
	        List<String> unique = ch.stream().distinct().sorted().collect(Collectors.toList());
	        
	        System.out.println(unique);
	        
	      //4. Find the first non-repeated character
	        
	        String s= "Ashish";
	        	        
	        Character firstNonRep = s.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(
	                    c -> c,
	                    LinkedHashMap::new,
	                    Collectors.counting()
	                ))
	                .entrySet()
	                .stream()
	                .filter(e -> e.getValue() == 1)
	                .map(Map.Entry::getKey)
	                .findFirst()
	                .orElse(null);
	        System.out.println(firstNonRep);
	        
	}

}
