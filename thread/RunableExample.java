package com.thread;

public class RunableExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello :" + Thread.currentThread().getName());

		System.out.println("This is runable :" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Start :" + Thread.currentThread().getName());

		RunableExample demo = new RunableExample();
		Thread t1 = new Thread(demo);
		t1.start();
		
		System.out.println("End :" + Thread.currentThread().getName());

	}
}
