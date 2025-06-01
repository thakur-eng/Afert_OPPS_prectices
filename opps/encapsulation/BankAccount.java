package com.opps.encapsulation;

public class BankAccount {
	
	private double balance;
	
	public BankAccount(double initialBalance) {
		
		if(initialBalance >0) {
			
			this.balance=initialBalance;
		}
	}
	
	public void deposite(double amount)
	{
		if(amount > 0)
		{
			balance +=amount;
			System.out.println("Deposite :" + amount);
		}
	}
	
	public void withrow(double amount)
	{
	
		if(amount > 0  && amount <= balance )
		{
			balance -= amount;
			System.out.println("Withdrawn :" + amount);
		}
		else
		{
			System.out.println("Insufficient blance or invalide amount .");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
}



 
