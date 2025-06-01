package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThread  implements Runnable {

	String taskName;
	
	ExecutorThread(String _taskName){
		this.taskName= _taskName;
	}
	
	
	public void run() {
		System.out.println("Current thread --> "+ Thread.currentThread().getName()+"Executor Task "+ taskName);
	}
	
	public static void main(String[] args) {
		
		ExecutorService executorService =  Executors.newFixedThreadPool(10);
		
		for(int i=1; i<=10;i++) {
			
			ExecutorThread executorThread = new ExecutorThread("ExecutorThread"+i);
			executorService.submit(executorThread);
			
		}
		executorService.shutdown();
		
 
	}

}
