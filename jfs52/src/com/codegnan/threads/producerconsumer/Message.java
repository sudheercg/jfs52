package com.codegnan.threads.producerconsumer;

public class Message {

	private boolean isMessageAvailable = false;

	// read method used by consumer
	// write() to be used by Producer
	
	//producer uses write() to write the message
	public synchronized void write() {

		try {
			while (isMessageAvailable) {
				wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Producer: Writing Message");
		isMessageAvailable = true;
		notify();

	}

	
	//Consumer uses read() to read the message
	public synchronized void read() {

		try {
			while (!isMessageAvailable) {
				wait();
			}
			System.out.println("Consumer: Read the message");
			isMessageAvailable = false;
			notifyAll();// wakes up producer, so that it can write again
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
