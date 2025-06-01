package com.Interface;

//@FunctionalInterface 
interface MyFunctionalInterface {
	
	void show();
}

public class LambdaExample {

	public static void main(String[] args) {
 
		MyFunctionalInterface obj = () -> { System.out.println("Thsi is lambda exprection");};
	
	     obj.show();
	}

}
