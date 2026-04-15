package com.codegnan.exceptionhandling;

public class Demo3 {
	
	 static void method1() throws ArithmeticException {		 
		System.out.println("method1");
		method2();
	}	
	static void method2() throws ArithmeticException {
		System.out.println("method2");
		method3();
		
	}	
	static void method3() throws ArithmeticException  {
		    System.out.println("method3");
			int x= 100/0;//ArithmeticException
		
	}	
	public static void main(String[] args) {	
		Demo3 dobj = new Demo3();
	
		
		System.out.println("Main method started");	
		try{method1();	
		}catch(ArithmeticException obj) {
			obj.printStackTrace();
		}
		
		System.out.println("Main method ended");
		
	}
	//mainmethod started
	//method1
	//method2
	//method3

}
