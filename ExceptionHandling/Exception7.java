package com.ExceptionHandling;



public class Exception7 {
	static String a = "PRASHANT KUMAR";
	
	
	public void m1() {
		System.out.println( Exception7.a);
		try {
		System.out.println(10/0);
		}
		catch (ArithmeticException e)
		{
		 System.out.println("Exception is work ");	
		}
		
		System.out.println("PRASHANT KUMAR I LOVE YOU");
	}

	public static void main(String[] args) {
Exception7 s1=new Exception7 ();
s1.m1();
     		
	}
}
