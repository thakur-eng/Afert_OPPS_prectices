package com.ExceptionHandling;

public class Exception10 {

	public static void main(String[] args) {

		System.out.println("Start");

		Exception10 exception10 = new Exception10();

		try {
			exception10.dosomething();
		} catch (Exception e) {
				
		}

		System.out.println("come");
	}

	public void dosomething() throws ClassNotFoundException,Exception {
		
		Class.forName("some class name");

		String name = null;
		int len = name.length();

		int arr[] = new int[10];

		int val = arr[12];
		
		System.out.println("End ");

	}

}
