package com.Interface;

interface Multiply {
	int multiply(int a, int b); // return type
}

public class Lambda_Parameter_Return {

	public static void main(String[] args) {
		
		Multiply multi = (a, b) -> a * b;
		
		//Lambda me body chhoti hai, isliye curly braces {} nahi lagaye.

         //Direct result return kara diya!
		
		int result = multi.multiply(7, 8);
		
		System.out.println(result);
	}

}
