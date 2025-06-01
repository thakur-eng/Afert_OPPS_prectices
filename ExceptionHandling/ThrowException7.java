package com.ExceptionHandling;

public class ThrowException7 {

	public static int divideNum(int m, int n) 
	{
		int div = m/n;
		return div;
	}
	
	public static void main(String[] args) {

		ThrowException7 obj = new ThrowException7();
		
		try {
			System.out.println(  obj.divideNum(45,0));
			
		}
		catch(ArithmeticException e )
		{
            System.out.println("\nNumber cannot be divided by 0");  

		}

        System.out.println("Rest of code ");	
	}
	
	
 
}
 