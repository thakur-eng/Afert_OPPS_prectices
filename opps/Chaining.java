package com.opps;
//

//account class
//{blance }
//saving account
//{ blance and intrest }
//curreent account
//{balance and intres is not thare }
//class bank blance main
//{main mathod and call all to heare }

class Account {
	int balance;

	Account(int balance) {
		this.balance = balance;
	}

	void balance(int balance) {
	}
}

class SavingAccount extends Account 
 
{
	
	int intrest;

	SavingAccount(int intrest , int balance ) {
		super(balance);
        this.intrest =intrest *10/100;

		System.out.println("this is our intrest class ");
	}
}



public class Chaining {
	public static void main(String[] args) {
		Account s = new Account(1);
		
		System.out.println(s.balance +"   account  class ");
		
		SavingAccount sa = new SavingAccount(8,2);
		
		System.out.println(sa.intrest + " "+ sa.balance);
	}
}
