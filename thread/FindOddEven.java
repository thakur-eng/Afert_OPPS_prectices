package com.thread;

class ShareResource {

	private boolean available = false;

	public synchronized void odd(int i) throws InterruptedException {
		while (available) {
			wait();
		}

		available = true;
		System.out.println("Odd : " + i);
		notify();
	}

	public synchronized void even(int i) throws InterruptedException {
		while (!available) {
			wait();
		}

		System.out.println("Even : " + i);
		available = false;
		notify();
	}

}

class Even extends Thread {
	ShareResource resource;

	Even(ShareResource resource) {
		this.resource = resource;
	}

	public void run() {
		try {
			for (int i = 1; i <= 15; i++) {
				if (i % 2 == 0) {
					// System.out.println("Even.run() "+i);
					resource.even(i);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Odd extends Thread {
	ShareResource resource;

	Odd(ShareResource resource) {
		this.resource = resource;
	}

	public void run() {
		try {
			for (int i = 1; i <= 15; i++) {
				if (i % 2 != 0) {

					resource.odd(i);
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class FindOddEven {

	public static void main(String[] args) {

		ShareResource resource = new ShareResource();

		Odd Odd = new Odd(resource);

		Even Even = new Even(resource);

		Odd.start();
		Even.start();
	}

}
