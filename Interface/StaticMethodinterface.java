package com.Interface;


interface Calculat
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
}
public class StaticMethodinterface implements Calculat {

	public static void main(String[] args) {
		int sum = Calculat.add(53, 71);
		System.out.println( sum);   

		
	}

}
