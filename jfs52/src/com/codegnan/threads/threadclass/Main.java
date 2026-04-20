package com.codegnan.threads.threadclass;

public class Main {
	
	public static void main(String[] args) {
		
		//set the name to the main thread
		Thread.currentThread().setName("Main Thread");
		
		//Thread created by implementing Runnable interface
		RunnableThread runnable = new RunnableThread();
		Thread t1 = new Thread(runnable);
		//set the name to RunnableThread
		t1.setName("Runnable");
		t1.start();
		
		try {
			//main thread waits until t1 finishes.
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	

}
