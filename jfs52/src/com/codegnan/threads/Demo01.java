package com.codegnan.threads;

public class Demo01 {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+ t);
		System.out.println(t.getName());
		
		
	}

}
