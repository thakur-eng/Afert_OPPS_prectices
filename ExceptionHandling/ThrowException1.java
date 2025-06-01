package com.ExceptionHandling;

public class ThrowException1 {

	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person ia gatting to vote");
		} else {
			System.out.println("peron is  eligible to voten ");
		}
	}

	public static void main(String[] args) {

		validate(13);
		System.out.println("rest of the code ...");
	}

} 
