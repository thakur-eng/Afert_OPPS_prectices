package com.opps;

public class Constructor {

	int amount;
	String name;

	Constructor(int _amount, String _name) {
		this.amount = _amount;
		this.name = _name;

	}

	public static void main1(String[] args) {
		Constructor s1 = new Constructor(121, "Ram");

		System.out.println(s1.amount + " " + s1.name);
	}

	
	Constructor()
	{
	amount=121;
	name ="Prashant";
	}	
	
	public static void main(String[] args) {
		
		{
			Constructor s2=new Constructor();
			System.out.println(s2.amount +  " " + s2.name);
		}
	}
}
