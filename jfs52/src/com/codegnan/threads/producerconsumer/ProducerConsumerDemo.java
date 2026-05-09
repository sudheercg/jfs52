package com.codegnan.threads.producerconsumer;

public class ProducerConsumerDemo {
	
	public static void main(String[] args) {
		
		Message message = new Message(); 
		
		Thread producerThread = new Thread(new Producer(message));
		
		Thread consumerThread = new Thread(new Consumer(message));
		
	     producerThread.start();
	     consumerThread.start(); 
		
		
	}

}
