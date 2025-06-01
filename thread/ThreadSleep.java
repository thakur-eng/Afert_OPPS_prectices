package com.thread;

 
public class ThreadSleep extends Thread {
	
	@Override

	public void run() {
		System.out.println("Verifying Payment Details _" + Thread.currentThread().getName());
	  
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
 
		ThreadSleep task1 =new ThreadSleep();
		Thread t1 = new Thread(task1);
		t1.start();
		
		ThreadSleep task2 =new ThreadSleep();
		Thread t2 = new Thread(task2);
		t2.start();
	}

}
