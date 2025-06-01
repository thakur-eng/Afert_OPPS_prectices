package com.thread;

public class ExampleRunable implements  Runnable{
	

	@Override
	public void run() {
 
		System.out.println("Brewing coffee... Step 1");
		
		m1();
	}
	
	void m1() {
		System.out.println("Brewing coffee... Step 2");
         m2();
	}
	void m2() {
		System.out.println("Brewing coffee... Step 5");

	}

	public static void main(String[] args) {
 
 		
		Thread t1 = new Thread(new ExampleRunable());
		t1.start();
	
		for(int i = 1; i<=5;i++) {
			System.out.println("Customer is waiting...");
		}
	}


}
