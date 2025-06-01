package com.opps.abstractclass;

abstract class Payment{
	abstract void makePayment(double amount);
}

class UpiPayment extends Payment{

	@Override
	void makePayment(double amount) {
 System.out.println("Paid Rs " + amount + " via UPI");		
	}
	
}

class CardPayment extends Payment {

	@Override
	void makePayment(double amount) {
    
		System.out.println("Paid Rs "+ amount + " via Card ");
	}
	
}



public class PaymentSystem {

	public static void main(String[] args) {
 
		Payment p = new UpiPayment();
		p.makePayment(122);
		
		Payment p1 = new CardPayment();
		p1.makePayment(6000);
		
		
	}

}
