package com.codegnan.java8enhancements;

public class Demo  {

	public void myMethod1() {
		System.out.println("My Method");
	}
	
	public static void main(String[] args) {
		
		MyInterface m = ()->System.out.println("My Method implementation using Lambda expressiobn");
		
		m.myMethod1();
		
		
	}
}
