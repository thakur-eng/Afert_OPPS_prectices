package com.Interface;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
 
		Predicate<Integer> isEven = (number) -> number %2==0;
		
		System.out.println("Check is Even :" + isEven.test(4));

		System.out.println("Check is Even :" + isEven.test(43));

	}

}
