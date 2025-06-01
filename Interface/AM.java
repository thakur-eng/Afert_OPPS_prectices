package com.Interface;

 interface BankSystem {
	
	public abstract void pay();
	
	public abstract void addpayee();
	
	public abstract void deletpayee();
	
	public abstract void settle();
	
	void managepayee();                   // default public and abstract 
	
	public static final int MAX =100;      // constant
	
	public static final int MIN =50;    //constant is by default public static void final 
	
}

 class SBI implements BankSystem
{
	@Override
	
	public void pay()
	{
		System.out.println("SBI.pay()");
		int k =BankSystem.MAX;
		int l = BankSystem.MIN;
		
	}
	
@Override
	
	public void addpayee()
	{
		System.out.println("SBI.addoayee()");
	}

@Override

public void deletpayee()
{
	System.out.println("SBI.deletpayee()");
}

@Override

public void settle()
{
	System.out.println("SBI.settle()");
}

@Override

public void managepayee()
{
	System.out.println("SBI.managepayee()");
}

}
 
 public class  AM 
 {
	 public static void main(String[] args)
	 {
		 BankSystem s =  new SBI();
		 s.managepayee();
		 
	}
	
	 
 }
 
