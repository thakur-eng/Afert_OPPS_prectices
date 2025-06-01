package com.opps;

public class Hierarchical {

	public static void main(String agrs[]) {
		String s = "Ashish";
		System.out.println(s);
		
		ram oa= new ram();
		oa.m1();
		Second ob= new Second();
		ob.m2();
	}
}
class ram extends Hierarchical {
	void m1() {
		System.out.println("got it");
	}

}

class Second extends Hierarchical {
	void m2() {
		System.out.println("Yess knows");	
	}
}

class Food
{
	public void m3()
	{
		String sm= " Apple";
		System.out.println(sm);
		
		Food fd=new Food();
		fd.m3();
		//fd.Hierarchical();
	}
	}
