package com.CollectionFremWork;
import java.util.*;
public class CommonElementsTwoArrays {

	public static void main(String[] args) {
  
		int arr1[]= {1,2,3,4,5,6,7,8,9,20,40,60};
		int arr2[]= {9,8,7,6,5,4,3,3,2,10,30,50,70};
		
		Set<Integer> set1= new HashSet<>();
		Set<Integer> common= new HashSet<>();
		 
		for(int num: arr1)
			set1.add(num);
			for(int num: arr2)	
			{
			if (set1.contains(num))
			{
				common.add(num);
			}
	      }
			System.out.println(common);

	}}
