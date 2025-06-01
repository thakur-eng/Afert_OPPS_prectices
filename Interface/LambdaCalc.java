package com.Interface;

interface Operation{
	int operation (int a,int b);
}


public class LambdaCalc {

	public static void main(String[] args) {
		
		Operation add = (a,b) -> a+b;
		
		Operation sub = (a,b) -> a-b;
		
		Operation mul = (a,b) -> a*b;
 
		
		System.out.println("Addition :" + add.operation(11, 11));
		
		System.out.println("Subtraction :" + sub.operation(11, 11));

		System.out.println("Multiplication :" + mul.operation(11, 11));

	}

}
