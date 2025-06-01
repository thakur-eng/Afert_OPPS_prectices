package com.ExceptionHandling;

public class Exception13 {

	public static void main(String[] args) {

		System.out.println("Start heare ");

		try {
			System.out.println("come here 1");
			String name = null;
			System.out.println(name.length());

			System.out.println("come point 2 ");

			int a = 10 / 0;
			System.out.println(a);

			System.out.println("come point 3");
		} catch (NullPointerException n) {

			System.out.println("catch block Null point");

		}

		catch (ArithmeticException a) {

			System.out.println(" catch block Run time ");

		}

		catch (RuntimeException r) {

			System.out.println(" catch block Run time ");

		}

	}
}
