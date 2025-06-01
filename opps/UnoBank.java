package com.opps;

public class UnoBank extends Bank2 {

	void calculate() {

		int a = 80;
		int b = 8;
		int c = a - b;
		System.out.println("sub=" + c);
	}

	public static void main(String[] args) {

		UnoBank UB = new UnoBank();

		UB.Add();
		System.out.println("yrest ");

		UB.calculate();

	}

}
