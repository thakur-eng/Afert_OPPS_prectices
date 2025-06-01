package com.Interface;


interface Animal{
	void sound();

	
}


public class InterfaceWithOneMethod  implements Animal

{

	@Override
	public void sound() {
		
		// Implementation of sound method
        System.out.println("Animal makes a sound.");

		 System.out.println("Interface with one mathod ");
		
	}

	public static void main(String[] args) {
	
		System.out.println("i am calling through creating object   ");
		
		// Using an instance of the class that implements the interface
		
        Animal a = new InterfaceWithOneMethod();
        a.sound(); // Call the method to see the output

		 System.out.println("Exit ");
	}
}
