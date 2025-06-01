package com.opps;

class Bank3 {

	public int caseg() {

		System.out.println("PROGRAM START");
		int amount = 2000;
		System.out.println(amount);
		return 0;

	}

}

public class Hdfc extends Bank3 {

	public static void main(String[] args) {
		System.out.println("OBJECT CREATED");
		Hdfc hdfc = new Hdfc();
		System.out.println("Calling the enherit class");
		hdfc.caseg();
		System.out.println("PROGRAM END");

	}

}
