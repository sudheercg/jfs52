package com.codegnan.threads.threadpriorities;

public class PriorityDemo extends Thread{
	
	public PriorityDemo(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=5;i++) {		
	     System.out.println(
		   "Thread: "+Thread.currentThread().getName()+
			"|Priority: "+Thread.currentThread().getPriority()
			+"|Value: "+i);
		}
		
		
	}
	

}
