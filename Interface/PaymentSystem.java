package com.Interface;

interface Payment {
	void pay(double amount);
}

public class PaymentSystem {

	public static void main(String[] args) {

		Payment upiPayment = (amount) -> System.out.println("Paid Rs :" + amount + " via UPI");

		Payment cardPayment = (amount) -> System.out.println("paid Rs :" + amount + " vai Card");

		Payment cashPayment = (amount) -> System.out.println("Paid Rs :" + amount + " via Case");

		Payment checkPayment = (amount) -> System.out.println("Paid Rs :" + amount + " via Check");

		upiPayment.pay(19876);
		cardPayment.pay(56689);
		cashPayment.pay(12000);
		checkPayment.pay(590000);

		System.out.println("Thankyou for wisiting ");
	}

}
