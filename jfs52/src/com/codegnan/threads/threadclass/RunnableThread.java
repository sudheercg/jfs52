package com.codegnan.threads.threadclass;

public class RunnableThread  implements Runnable{
	
	public  void run() {
		
		for(int i =1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			// sleep for 1000 milliseconds or 1 second
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
		}
	                
	}

}
