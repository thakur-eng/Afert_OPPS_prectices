package com.opps.abstractclass;


interface Animal {
	void sound();
}

class Dog implements Animal{

	@Override
	public void sound() {
 System.out.println("Dog barks ");		
	}
	
}



public class ExamplewithInterface {

	public static void main(String[] args) {
		
		Animal a= new Dog();
		a.sound();
 
	}

}
