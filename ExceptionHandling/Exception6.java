package com.ExceptionHandling;

public class Exception6 {

	public static void main(String[] args) {

		try {
			int num=10/0;
			
			String s=  null;
			System.out.println(s.length());
		} 
		
		catch (ArithmeticException e) 
		{
			System.out.println(" Arithmetic Exception  " + e );
		}
		
		catch(NullPointerException e)
		{
		System.out.println(" Null pointer exception Exception" + e);	
		}
	}

}
