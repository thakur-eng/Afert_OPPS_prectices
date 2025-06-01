package com.thread;

public class SolutionUsingSynchronized {

	static int balance = 100;
	
	public void run() {
		withdraw(70);
	}

	private synchronized void withdraw(int amount) {
 		
		if (balance >=amount) {
			System.out.println(Thread.currentThread().getName() + "is going to withraw...");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName()+ "completed withdrawal . remaining:" + balance);
		}else {
			System.out.println(Thread.currentThread().getName()+ " - not enough balance ");
		}
	}

	public static void main(String[] args) {
 
		WithoutSynchronizedExample t1 = new WithoutSynchronizedExample();
		WithoutSynchronizedExample t2 = new WithoutSynchronizedExample();

		t1.start();
		t2.start();
	}

}
