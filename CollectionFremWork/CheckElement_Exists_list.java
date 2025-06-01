package com.CollectionFremWork;

import java.util.*;

public class CheckElement_Exists_list {

	public static void main(String[] args) {

		List<Character> list= new ArrayList<>(Arrays.asList('A','B','C','D','E'));
		
		System.out.println(list.contains('G'));
		System.out.println(list.contains('B'));
		 
	}
}
