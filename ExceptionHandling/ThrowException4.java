package com.ExceptionHandling;

public class ThrowException4 {

	public static int divider(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Can not divide by Zero");
		}
		return a / b;
	}

	public static void main(String[] args) {
		System.out.println(divider(10, 2));
		System.out.println(divider(10, 0));
	}

}
