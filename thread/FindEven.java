package com.thread;

public class FindEven extends odd implements Runnable {

	public void run() {

		even();

	}

	public void even() {
		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				System.out.println("Even = " + i + Thread.currentThread().getName());
			}
//			else {
//				if (i % 2 != 0) {
//					System.out.println("Odd = "+i);
//				}
//				
//			}
		}
	}

//	public void odd() {
//		for (int i = 0; i < 10; i++) {
//
//			if (i % 2 != 0) {
//				System.out.println("Odd = "+i);
//			}
//		}
//	}

	public static void main(String[] args) throws InterruptedException {

		FindEven even = new FindEven();
		Thread t1 = new Thread(even);
		t1.start();

		FindEven odd = new FindEven();
		Thread t2 = new Thread(odd);

		t2.start();

	}

}

class odd extends Thread {

	public void run() {
		odd();
	}

	public void odd() {
		for (int i = 0; i < 10; i++) {

			if (i % 2 != 0) {
				System.out.println("Odd = " + i + Thread.currentThread().getName());
			}
		}
	}

}
