package com.ExceptionHandling;

public class Exception11 {

	public static void main(String[] args) {

		System.out.println("Start");

		Exception10 exception10 = new Exception10();

		try {
			
			exception10.dosomething();
			
		} catch (Exception e) {

			
			System.out.println("Exception11.main()");
		}

		System.out.println("come");
	}
 
	public void dosomething(String  _className) throws Exception {

		Class.forName("some class name");

		String name = null;
		try {

			int len = name.length();

		} catch (Exception e) {

			throw new Exception();

		}
		
		finally{
			System.out.println();
		}
		int arr[] = new int[10];

		int val = arr[12];

		System.out.println("End ");

	}
	
	
}
