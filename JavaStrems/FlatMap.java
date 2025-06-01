package com.JavaStrems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {

List<List<String>> words = Arrays.asList(Arrays.asList("this","is","list"),Arrays.asList("Kodewala","is","cpching","inst"),Arrays.asList("are","doing","job"));
		
List<String> word = words.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

System.out.println(word);

List<String> length = words.stream().flatMap(list -> list.stream()).filter(n ->n.length() >3).collect(Collectors.toList());

System.out.println(length);

List<List<Integer>> number = Arrays.asList(Arrays.asList(1,2,3,5,6,7,8),Arrays.asList(1,23,4,6,7,4,2,5,78,7,3,2,5,5),Arrays.asList(2,43,5,7,5,2,4,7,8,6,2,3));

List<Integer> num = number.stream().flatMap(list -> list.stream()).sorted().collect(Collectors.toList());

System.out.println(num);



	}
}