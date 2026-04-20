package com.codegnan.threads.producerconsumer;

public class Producer implements Runnable {
	
	
	private Message message; 
	
	public Producer(Message message) {
		this.message= message;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			message.write();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
