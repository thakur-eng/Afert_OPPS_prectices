package com.Interface;

interface Message {
	void sayHello(); 
}
public class FunctionalInterface {

	public static void main(String[] args) {
 
		Message msg= () -> System.out.println("From Functional Interface ");
		
		msg.sayHello();
	}

}
