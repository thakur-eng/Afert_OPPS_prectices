package com.ExceptionHandling;

public class ThrowException8 {

	static void method()
	{
		System.out.println("Inside the method ()");
		throw new ArithmeticException("Throwing Arithmetic Eception");
	}
	
	
	public static void main(String[] args) {
	
		try {
			method();
			
		}
		catch(ArithmeticException e) {
			System.out.println("catch is in main() method ");
		}
	}
	

}
