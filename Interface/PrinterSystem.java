package com.Interface;

interface Printer{
	void print();
}
class LaserPrinter implements Printer{

	@Override
	public void print() {
 
		System.out.println("Printing with Laser Printer");
	}
	
}

class InkjetPrinter implements Printer{

	@Override
	public void print() {
 
		System.out.println("Printing with Inkjet Printer");
	}

}

public class PrinterSystem {

	public static void main(String[] args) {
 
		Printer p1 = new LaserPrinter();
		p1.print();
		
		Printer p2 = new InkjetPrinter();
		p2.print();
	}

}
