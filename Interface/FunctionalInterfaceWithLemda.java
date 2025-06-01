package com.Interface;

interface Calculator {
	int add(int a, int b);
}

public class FunctionalInterfaceWithLemda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lambda expression to implement the add method
		Calculator calc = (a, b) -> a + b;

		// Calling the method using the lambda
		int result = calc.add(10, 20);

		// Printing the result
		System.out.println("Sum: " + result);
	}

}
