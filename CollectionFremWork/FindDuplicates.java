package com.CollectionFremWork;

import java.util.*;
public class FindDuplicates {

	public static void main(String[] args) {
 
		int arr []= {1,2,3,4,5,2,5,8,4,10};
		
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for(int num :arr)
		{
			if(!seen.add(num))
			{
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);
	}
}
