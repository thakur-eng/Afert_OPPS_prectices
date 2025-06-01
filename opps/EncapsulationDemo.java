package com.opps;

class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;

	}

	public double getbBalance() {
		return balance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposite :" + amount);
		} else {
			System.out.println("Invailed amount ");

		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdraw :" + amount);
		} else {
			System.out.println("Insufficient funds or invalid amount ");
		}

	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1000);
		acc.deposite(500);
		acc.withdraw(200);
		System.out.println("Final Balance :" + acc.getbBalance());
	}

}
