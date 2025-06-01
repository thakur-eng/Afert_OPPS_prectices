package com.Pattern;

public class A extends B {
	int a ;
	int b;
   A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
   
	public static void main(String[] args) {
		A a =  new A(10,20);
	
		System.out.println("value of a from first object"+a.a);
		A b1 = new A(20,10);

		System.out.println("value of a from second object"+b1.a);
		System.out.println( a.minus(10, 20));
	}

	@Override
	int sum(int a, int b) {
		
		return a+b;
	}
}
