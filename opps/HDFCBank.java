package com.opps;

public class HDFCBank extends Bank1 {

	public int calculateInterest() {
		System.out.println("HDFCBank.getBalance");

		int balance = getBalance();

		int intrest = balance * 10 / 100;
		return intrest;
	}

	public static void main(String args[]) {
		HDFCBank hdfcbank = new HDFCBank();
		int balance = hdfcbank.getBalance();
		System.out.println(balance);

		int intrest = hdfcbank.calculateInterest();
		System.out.println(intrest);

	}

}
