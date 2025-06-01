package com.thread;

import com.opps.override;

public class ExampleThread_3 extends Thread {

	@override
	public void run() {

		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c + " " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		System.out.println("Main method ");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c + " " + Thread.currentThread().getName());

		
		ExampleThread_3 taske1 = new ExampleThread_3();
		
		Thread t1 = new Thread(taske1);
		t1.start();
		

//		Thread t1 = new Thread(new ExampleThread_3());
//		t1.start();
		
		 
	}

}
