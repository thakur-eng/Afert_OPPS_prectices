package com.thread;

public class JoinExample extends Thread {

	public void cookingFood() {

		System.out.println("We are making food in kitchan");
		serveFood();
	}

	public void orderAccepeted() {

		System.out.println("Your order is accepeted ");
		cookingFood();
	}

	@Override
	public void run() {

		orderAccepeted();
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Welcome to my RotiWala.com ");
		JoinExample t1 = new JoinExample();
		t1.start();
		t1.join();

		System.out.println("Thankyou viset again ");
		
	}

	public static void onlineOrder() {

		System.out.println("We are providing onlie food in zomoto");
	}

	public static void serveFood() {

		System.out.println("We are serving food in my hotal ");
		onlineOrder();
	}
}
