package com.codegnan.java8enhancements.lambdaexpressions;

public class Demo {
	
	public static void main(String[] args) {
		
		NameGenerator generator  =  (x,y)->x+y;
		System.out.println(generator.generateFullName("Suresh", "  Kumar"));
		
		
	}

}
