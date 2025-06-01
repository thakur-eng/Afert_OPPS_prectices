package com.opps.abstractclass;


abstract class Printer{
	abstract void print();

	void connect() {
		System.out.println("connecting to printer .. this is Concrete  method ");
	}
}

class LaserPrinter extends Printer{

	@Override
	void print() {
 System.out.println("Printing via LaserPrinter");		
	}
	
}


public class HybridUseofAbstract {

	public static void main(String[] args) {
		
		Printer p = new LaserPrinter();
		p.connect();
		p.print();
 
		
	}

}
