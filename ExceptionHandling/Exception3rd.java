package com.ExceptionHandling;

public class Exception3rd {

	public static void main(String[] args) {

		try {

			int myNumber[] = { 1, 3, 4, 5, 6 };

			System.out.println(myNumber[10]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Something is wrong ");
		}

		catch (Exception e) {
			System.out.println("Something is wrong ");
		}
	}

}
