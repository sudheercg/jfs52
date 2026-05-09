package com.codegnan.oop.blocks;

public class BlockDemo {
	
	int myInt;
	String myString;
	
	public BlockDemo(int myInt, String myString) {
		this.myInt= myInt;
		this.myString=myString; 
		System.out.println("Constructor called");
		
	}
	
	//static initializer block
	static{
		System.out.println("static block executed");
	}
	//Instance initializer block  - initialize the instance
	{

	  System.out.println("IIB executed");	
	}
	
	

}
