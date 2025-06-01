package com.Interface;

interface Flyable {
	void fly();
}

interface Swimmabl {
	void swim();
}

class Duck implements Flyable, Swimmabl {

	@Override
	public void fly() {
		System.out.println("Duck  is flying");
	}

	@Override
	public void swim() {
		System.out.println("Duck is swimming");
	}

}

public class FlyingSysem {

	public static void main(String[] args) {

		
		Duck flyingsystem = new Duck();
		
		flyingsystem.fly();
		
 		flyingsystem.swim();
	}

}
