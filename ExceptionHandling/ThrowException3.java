package com.ExceptionHandling;

class UserDefineException extends Exception {
	public UserDefineException(String str) {
		super(str);

	}

}

public class ThrowException3 {

	public static void main(String[] args) {

		try {
			throw new UserDefineException(" This is user-defined exception");

		} catch (UserDefineException u) {

			System.out.println("ThrowException catch block");
		}

	}

}
