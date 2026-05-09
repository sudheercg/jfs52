package com.codegnan.java8enhancements;

public class MyImpl implements MyInterface{

	@Override
	public void myMethod1() {
		System.out.println("My Method implementation");
		
	}
	
	public static void main(String[] args) {
		MyImpl impl = new MyImpl();
		
		//calling abstract method implementation
		impl.myMethod1();

		//calling a static method of interface using interface name
		MyInterface.myStaticMethod();
	
		//calling a default Method of interface using Object reference 
		impl.myDefaultMethod();
	    
	
	
	
	}
	
	
	
	

}
