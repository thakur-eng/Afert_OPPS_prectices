package com.ExceptionHandling;

public class DemoOfFinalBlock {

	public static void main(String[] args) {
			
		
		try {
			System.out.println(10/0);
			System.out.println("Ashish Try ");
		}
		catch(Exception e)
		{
			System.out.println("Prashant Catch ");
		}
		
		finally 
		{
			System.out.println("Final Block ");
		}
	}

}
