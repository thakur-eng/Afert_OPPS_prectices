package com.CollectionFremWork;

import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
 
		int a[]= {1,2,4,4,4,3,5,7,98,5,3,44,33,2,6,7,55,3,22,5,8,9,99,77,66,55,44};
		
		Set<Integer> num= new HashSet<>();
		
		for(Integer itr:a)
		{
			num.add(itr);
		}
		
		System.out.println(num);
	}

}
