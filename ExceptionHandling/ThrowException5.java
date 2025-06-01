package com.ExceptionHandling;


//Custom exception class that extends the built-in Exception class (checked exception)

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);  // Call parent class constructor to set the message
    }
}
// Constructor to accept custom error message

public class ThrowException5 {
    // Method to validate the input value, throws CustomException if value < 100

	
    public static void validate(int value) throws CustomException {
        if (value < 100) {
            // Throwing custom exception with a message

            throw new CustomException("Value must be >= 100");
        }
    }

    public static void main(String[] args) {
        try {
            // Calling validate method with 50 (which is less than 100)

            validate(50);
        } catch (CustomException e) {
            // Handling the custom exception and printing the message

            System.out.println("Caught: " + e.getMessage());
        }
    }
}
