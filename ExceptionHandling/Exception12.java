package com.ExceptionHandling;

public class Exception12 {

	public static void main(String[] args) {

		try {

			int a = 10 / 0;

			System.out.println(a);

		} catch (ArithmeticException a) {
			System.out.println("rrrrrrrrrrrrr");

		} finally {

			System.out.println("inner finaly block");

		}
		try {

			String s = null;

			System.out.println(s.length());
		}

		catch (NullPointerException n) {
			System.out.println("ttttttttttttttttt");
		} finally {
			System.out.println("outer finaly block");
		}
	}

}
