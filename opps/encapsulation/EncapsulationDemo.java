package com.opps.encapsulation;

public class EncapsulationDemo {
	
	private double balance;
	
	
	public void deposit(double amount) {
		if ( amount > 0)
		{
			balance += amount;
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	

	public static void main(String[] args) {
    
		EncapsulationDemo account = new EncapsulationDemo();
		
		account.deposit(1090);
		
		System.out.println("Current Balance : " + account.getBalance());
	}

}
