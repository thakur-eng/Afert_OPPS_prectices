package com.opps;

public class SBIBank extends Bank
{
	public void calcuLaterIntrest()
	{
		System.out.println("SBIBank.calcuLaterIntrest");
	}
	
	public static void main (String args[])
	{
		SBIBank c= new SBIBank();
		c.getBalance();
		c.calcuLaterIntrest();
		System.out.println(c.amount);
	}

}
