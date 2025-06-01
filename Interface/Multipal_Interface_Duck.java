package com.Interface;

interface Flyble{
	void fly();
}

interface Swimmable{
	void swim();
}


public class Multipal_Interface_Duck  implements Flyble,Swimmable{

	public static void main(String[] args) {
 
		Multipal_Interface_Duck md = new Multipal_Interface_Duck();
		md.fly();
		md.swim();
	}

	@Override
	public void swim() {
 System.out.println("Swim mathod ");		
	}

	@Override
	public void fly() {
 System.out.println("fly mathod ");		
	}

}
