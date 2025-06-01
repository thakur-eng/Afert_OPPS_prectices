package com.CollectionFremWork;

import java.util.*;
public class UniqueCharactersString {

	public static void main(String[] args) {

       String name = "Ashish Thakur ";
       
       Set<Character> cha = new HashSet<>();
       
       for(char ch: name.toCharArray())
       {
    	   cha.add(ch);
       }
		System.out.println("Unique Characters  Count " + cha.size());
	}

}
