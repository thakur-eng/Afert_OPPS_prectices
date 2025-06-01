package com.ExceptionHandling;

public class Exception14 {

	public static void main(String[] args) {

		//AritheticException
		int a=50/0;
		
		//NullPointException
		String name = null;
		int b=name.length();
		
		
		//NumberFormateException
		String s= "abc";
		int i=Integer.parseInt(s);   
		
		//ArrayIndexOutException
		int c[]=new int[5];
		c[10]=50;
		
		
	}

}
