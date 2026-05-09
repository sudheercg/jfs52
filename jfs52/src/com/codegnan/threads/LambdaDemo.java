package com.codegnan.threads;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		//Lambda expression
		MyIface m =  () ->System.out.println("From Lambda expression");
		
		m.doSomething();
		
	}

}
