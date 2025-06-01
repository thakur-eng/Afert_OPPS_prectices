package com.Interface;

interface Animals{
	void eat();
}
interface Bird extends Animals{
	void fly();
	
}

class Sparrow implements Bird{

	@Override
	public void eat() {
 System.out.println("Sparrow eating...");		
	}

	@Override
	public void fly() {
 System.out.println("Sparrow flying..");		
	}
	
}

public class InterfaceInheritanceExample {

	public static void main(String[] args) {
		
		Sparrow sparrow = new Sparrow();
		sparrow.eat();
		sparrow.fly();
 
	}

}
