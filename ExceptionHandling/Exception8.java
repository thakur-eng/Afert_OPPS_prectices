package com.ExceptionHandling;

class UserAlreadyExists extends Exception {
	public UserAlreadyExists(String message) {

		super(message);

	}
}

public class Exception8 {

	public static void main(String[] args) {

		try {

			String user = "KodeWala";

			if (user.equals("KodeWala")) {
				throw new UserAlreadyExists("User Already Exists in the system ");

			}
		}

		catch (UserAlreadyExists e) {
			System.out.println("Exception  Final EXIT ");
		}
	}

}
