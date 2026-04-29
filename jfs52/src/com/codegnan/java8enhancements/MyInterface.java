package com.codegnan.java8enhancements;

@FunctionalInterface
public interface MyInterface {
	
	//only one abstract method
	public void myMethod1();
	
	
	//public void myMethod2();
	
	//any number of static methods and default method
	
	public static void myStaticMethod() {
		System.out.println("My static method");
	}
	
	//default method
	default void myDefaultMethod() {
		System.out.println("Default Method in interface");	
	}
	
	/*
	//method with no access modifier
	// not allowed in java 8 interfaces
	void myMethod()
	{
		
	}
	
	*/
	

}
