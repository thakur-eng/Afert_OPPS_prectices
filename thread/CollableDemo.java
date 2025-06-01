package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableDemo implements Callable<String> {

	String taskName;

	CollableDemo(String _taskName) {
		this.taskName = _taskName;
	}

	public String call() {
		System.out.println("Current thread --> " + Thread.currentThread().getName() + " Executor Task " + taskName);

		return ("10");
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService exe = Executors.newCachedThreadPool();

		for (int i = 0; i < 10; i++) {

			CollableDemo collableDemo = new CollableDemo("CollableDemo " + i);

			Future<String> future = exe.submit(collableDemo);

			String returnValue = future.get();
			System.out.println(returnValue);
			if (returnValue.contains("200")) {
			}

		}
	}

}
