package com.codegnan.oop;


//parent
abstract class DemoA {
	
	
	//abstract method
	abstract void doSomething() ;
	
	abstract void doSomethingElse() ;

	
	//concrete method
	public void doSomethingCommon() {
		System.out.println("Common implementation");
	}
}
