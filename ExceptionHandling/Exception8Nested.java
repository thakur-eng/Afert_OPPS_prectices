package com.ExceptionHandling;

public class Exception8Nested {

	public static void main(String[] args) {

		try {
			System.out.println("Try block is START ");

			try {

				int n = 10;
				int res = n / 0;

			} catch (ArithmeticException a) {
				System.out.println("Arithmetic Exception");
			}

			try {

				String s = null;
				System.out.println(s.length());
			} catch (NullPointerException n) {
				System.out.println("Null Pointer Exception ");
			}  

			catch (Exception e) {
				System.out.println("final exception ");
			}
		}

		catch (Exception e) {

		} finally {
			System.out.println("finally block executed ");
		}

	}
}
