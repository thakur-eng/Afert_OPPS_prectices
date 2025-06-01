package com.thread;

public class ExampleSleep extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("This is Example of sleep :" + Thread.currentThread().getName());
		
		try {
			
			Thread.sleep(1000);
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		pay();
	}
	
	public void pay() {
		System.out.println("Initiating Bank Transfer"+ Thread.currentThread().getName());
	}
	

	public static void main(String[] args) {
 
		System.out.println("Main Method Start :" + Thread.currentThread().getName());
		
		ExampleSleep task1 = new ExampleSleep();
		Thread t1 = new Thread(task1);
		t1.start();
		
		ExampleSleep task2 = new ExampleSleep();
		Thread t2 = new Thread(task2);
		t2.start();
		System.out.println("Main Method End :" + Thread.currentThread().getName());
	}

}
