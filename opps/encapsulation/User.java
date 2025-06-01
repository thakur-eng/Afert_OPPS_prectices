package com.opps.encapsulation;

class details {
	private String s = "Ashish";

	public void printA() {
		System.out.println("Value of s is: " + s);
	}
}
public class User {

	public static void main(String[] args) {
		details a = new details();
		a.printA();
	}
}