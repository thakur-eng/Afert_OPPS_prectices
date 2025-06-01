package com.ExceptionHandling;

public class ExceptionFirst {

	public static void main(String[] args) {

		try {
			System.out.println("Ashish1");
			String name =null;
			
			System.out.println(name.length());
		}
		catch(Exception e)
		{
			System.out.println("Ashish2");
		}
		System.out.println("Ashish3");
	}

}
