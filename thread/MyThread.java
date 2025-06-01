package com.thread;

public class MyThread extends Thread

{
	@Override
	public void run() {
		System.out.println("Hellow ji ");
	}

	public static void main(String[] args) {

		System.out.println("Main start " + Thread.currentThread().getName());

		Thread t1 = new Thread(new MyThread());
		t1.start();
		
		Thread t2 = new Thread(new MyThread());
		t2.start();

		System.out.println("Main Ends ");
		System.out.println("t1 check ");
		System.out.println("t1 checking ");
		System.out.println("t1 check ");
		System.out.println("t1 checking ");
		System.out.println("t1 check ");
		System.out.println("t1 checking ");
	}

}
