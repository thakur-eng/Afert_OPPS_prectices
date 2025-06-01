package com.opps;

class AB {
	public static void main(String[] args) {
		coching1 coching =  new coching1();
		coching.m1();
		coching.m2();
		coching.m3();
		//coching.main(args);
		
	}
}

class school extends AB
{
	void m1()
	{
		System.out.println("i am school");
	}
}

class coching extends school
{
	void m2()
	{
		System.out.println("i am coching");
	}
}
class coching1 extends coching
{
	void m3()
	{
		System.out.println("i am coching1");
	}
}