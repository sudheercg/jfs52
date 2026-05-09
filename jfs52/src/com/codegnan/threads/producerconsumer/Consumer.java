package com.codegnan.threads.producerconsumer;

public class Consumer implements Runnable{

	private Message message;

	public Consumer(Message message) {
		this.message=message;
	}
	
	public void run() {
		for(int i=0;i<10;i++)
		message.read();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
