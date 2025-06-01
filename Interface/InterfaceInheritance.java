package com.Interface;

interface Bykee {
	void normalbyke();

}

interface SupperByke extends Bykee {
	void supperbyke();
}

public class InterfaceInheritance implements SupperByke {

	@Override
	public void normalbyke() {
		System.out.println("This is normal Byke ");
	}

	@Override
	public void supperbyke() {
		System.out.println("This is  Supper Byke like rasing byke  ");

	}

	public static void main(String[] args) {
		System.out.println("Start");

		// Polymorphism with Byke reference

		Bykee Obj = new InterfaceInheritance();
		Obj.normalbyke();

		// Polymorphism with SupperByke reference

		SupperByke Ob = new InterfaceInheritance();
		Ob.normalbyke();
		Ob.supperbyke();

		System.out.println("Exit");

	}

}
