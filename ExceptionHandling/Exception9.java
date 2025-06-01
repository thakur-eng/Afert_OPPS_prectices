package com.ExceptionHandling;

public class Exception9 {

	public static void main(String[] args) {

		try {
			int arr[] = new int[] { 10, 20, 30, 40, 50 };

			int a = arr[10];

			System.out.println("this is find Array " + a);

			try {

				String name = null;

				int len = name.length();
			} catch (NullPointerException n) {
				System.out.println("Exception work EXit");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception final Exit ");
		}

	}

}
