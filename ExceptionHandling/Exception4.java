package com.ExceptionHandling;

public class Exception4 {

	public static void main(String[] args) {
		
		
		try {
			String name = null;
			
			int len  =name.length();
			
			System.out.println(len);
		}
		catch(Exception e)
		{
			System.out.println("Not working ");
		}

	}

}









