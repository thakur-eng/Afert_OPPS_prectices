package com.thread;

class ShareResources {

	private int data;
	private boolean available = false;

	public synchronized void produce(int value) throws InterruptedException {
		while (available) {
			wait();
		}
		data = value;
		available = true;
		System.out.println("Produced : " + data);
		notify();
	}

	public synchronized void consume() throws InterruptedException {
		while (!available) {
			wait();
		}
		
		System.out.println("Consumed : " + data);
		available=false;
		notify();
	}

}

class Producer extends Thread {
	ShareResources resource;

	Producer(ShareResources resource) {
		this.resource = resource;
	}

	public void run() {
		try {
			for (int i = 1; i <= 15; i++) {
				resource.produce(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

class Consumer extends Thread {
	ShareResources resource;

	Consumer(ShareResources resource) {
		this.resource = resource;
	}

	public void run() {
		try {
			for (int i = 1; i <= 15; i++) {
				resource.consume();
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class InterThreadDemo {

	public static void main(String[] args) {
		ShareResources resource = new ShareResources();

		Producer producer = new Producer(resource);

		Consumer consumer = new Consumer(resource);

		producer.start();
		consumer.start();
	}

}
