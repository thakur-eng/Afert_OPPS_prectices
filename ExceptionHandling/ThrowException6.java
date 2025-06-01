package com.ExceptionHandling;

public class ThrowException6 {

	
	public static void checkNum(int num)
	{
		if(num <1)
		{
			throw new ArithmeticException("Number is negative, cannot calculate square");
		}
		else {
			System.out.println("Square of " + num + "is" + (num*num));
		}
	}
	
	
	public static void main(String[] args) {

		ThrowException6 obj = new ThrowException6();
		obj.checkNum(-3);
		System.out.println("Rest of the code..");
	}

}
