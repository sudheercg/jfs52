package com.codegnan.wrapperclasses;

public class Demo {
	
	public static void main(String[] args) {
		
		//byte - Byte
		//short - Short
		//int  - Integer
		//long - Long
		//float - Float
		//double - Double
		//boolean - Boolean
		//char -  Character
		
		int i =10;
		
		//autoboxing
		Integer iObj = i;
		
		//autounboxing
		int a =iObj;
		
		Integer intObj = new Integer(i); //older way
		
		
		// primitive to object, use valueOf() method
		Integer intObj1 = Integer.valueOf(i); // better
		
		//object to primitive, use xxxvalue();
		int a1 = intObj.intValue();
		
		
		
		
		
		
		
		
	}

}
