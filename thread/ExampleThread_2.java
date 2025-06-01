package com.thread;

public class ExampleThread_2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Hellow World " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
 
		System.out.println("Hellow world " + Thread.currentThread().getId());
		
		Thread t1 = new Thread(new ExampleThread_2());
		t1.start();
		
		Thread t2 = new Thread(new ExampleThread_2());
		t2.start();
		
		t1.getId();
		System.out.println(t1.getId());
	}

}
