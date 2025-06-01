package com.opps;

public class Cons {

	int amount;
	String  name;
	
	Cons()
	{
		amount=6000;
		name="Rasiyan";
		
	}	
	
	public static void main(String[] args) {
		
		Cons c= new Cons();
		
		System.out.println(  c.name + " Rs " +c.amount);
	}
}
