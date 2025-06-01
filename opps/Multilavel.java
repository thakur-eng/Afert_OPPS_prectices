package com.opps;

public class Multilavel {
	public static void main(String args[]) {
		System.out.println("Start");
		G ob = new G();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
		ob.m5();
		ob.m6();
		ob.m7();
	}
}
class A extends Multilavel {
	void m1() {
		System.out.println("midell");
	}
}
class B extends A {
	void m2() {
		System.out.println("Last");
	}
}
class C extends B {
	public void m3() {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println("this the Add value of a,b = " + c);
	}
}
class D extends C {
	void m4() {
		int a = 5;
		int b = 10;
		int c = a - b;
		System.out.println("this the Sub value of a,b = " + c);
	}
}
class E extends D {
	void m5() {
		int a = 5;
		int b = 10;
		int c = a * b;
		System.out.println("this the Mul value of a,b =" + c);
	}
}
class F extends E {
	public void m6() {
		int a = 5;
		int b = 10;
		int c = a / b;
		System.out.println("this the Div value of a,b = " + c);
	}
}
class G extends F {
	void m7() {
		int a = 5;
		int b = 10;
		int c = a % b;
		System.out.println("this the mud value of a,b = " + c);

	}
}
