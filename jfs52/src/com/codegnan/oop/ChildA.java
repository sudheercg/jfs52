package com.codegnan.oop;


//The type ChildA must implement the inherited abstract method DemoA.doSomething()
public class ChildA extends DemoA {
	
	//override doSomething
	
	public void doSomething() {
		System.out.println("Doing something in ChildA");
	}
	
	public void doSomethingElse() {
		System.out.println("Doing something else in ChildA");
	}

	
	public static void main(String[] args) {
		
		//Cannot instantiate the type DemoA
		//DemoA a = new DemoA();
	}
	
	
}
