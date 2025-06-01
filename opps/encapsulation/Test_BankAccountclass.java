package com.opps.encapsulation;

public class Test_BankAccountclass {

	public static void main(String[] args) {
 
		BankAccount account = new BankAccount(1000);
		
		account.deposite(3900);
		account.withrow(870);
		
		System.out.println("Current Balance :" + account.getBalance());
	}

}
