package com.ExceptionHandling;

public class Exception5 {

	public static void main(String[] args) {
		System.out.println("Program START ");

		int[] arr = { 10, 20, 30, 40, 50 };

		//System.out.println(arr[9]);      // this is exception  we can handle on try block 

		System.out.println("End ");

		try {

		//	int[] arr = { 10, 20, 30, 40, 50 };

			System.out.println(arr[9]);     //   hendleing exception 

			System.out.println("End ");
		}

		catch (Exception e) {

			System.out.println("Exception is handal by catch block ");
		}
	}

}
