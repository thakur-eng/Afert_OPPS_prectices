package com.Pattern;

public class AbstractionExample {

	public static void main(String[] args) {

		Car myCar = new Tesla();
		myCar.start();
		myCar.stop();

		myCar = new BMW();
		myCar.start();
		myCar.stop();

	}
}
