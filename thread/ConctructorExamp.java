package com.thread;

class A
{
	 A() {
		System.out.println("Ashish11111111111");
	}
}
class B extends A {

	B() {
		System.out.println("Prashant ");
	}
}

class C extends B {
	 

	C() {
		System.out.println("Prashant jiii ");
	} 
	
}


public class ConctructorExamp {

	public static void main(String[] args) {
		
		C c= new C();
	}

}
