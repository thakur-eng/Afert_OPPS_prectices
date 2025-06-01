package com.thread;

public class Print1to20Thread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Method Start ");
		
		
		Print1to20Thread task= new Print1to20Thread();
		Thread t4 = new Thread(task);
		t4.start();
		
		
		Thread t1 = new Thread(new Print1to20Thread());
		//t1.start();
		t1.run();

		Thread t2 = new Thread(new Print1to20Thread());
		//t2.start();

		t2.run();
		System.out.println("Main Method End ");
	}

}
