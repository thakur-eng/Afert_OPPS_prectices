package com.opps;

class Bank4 {

	public int caseg() {

		int amount = 2000;
		System.out.println(amount);
		return 10000;

	}

}

class UnionBank extends Bank4 {
	public static void main(String args[]) {
		UnionBank ub = new UnionBank();

		ub.caseg();
		System.out.println("thankyou");
	}

}
