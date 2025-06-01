package com.thread;

class Tasks {
	public  void doSomething() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Value if is " + "and this executed by thread" + Thread.currentThread().getName());
		}
	}
}

public class SyncDemo extends Thread {

	Tasks tasks;

	@Override
	public void run() {

		tasks.doSomething();

	}

	SyncDemo(Tasks _tasks) {
		this.tasks = _tasks; 

	}

	public static void main(String[] args) {
		Tasks task = new Tasks();
		SyncDemo thread1 = new SyncDemo(task);
		thread1.start();
		SyncDemo thread2 = new SyncDemo(task);
		thread2.start();

	}

}
