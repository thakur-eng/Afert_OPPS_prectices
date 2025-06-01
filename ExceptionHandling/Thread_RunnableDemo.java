package com.ExceptionHandling;

 
	class Thread_RunnableDemo extends Thread implements Runnable {
	    public void run() {
	        System.out.println("Hellow ");
	    }

	    public static void main(String[] args) {
	    	Thread_RunnableDemo task = new Thread_RunnableDemo ();
	        Thread t1 = new Thread(task);  
	        t1.start();
	    }
	}


