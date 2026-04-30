package com.codegnan.java8enhancements.predefinedfi;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		
		//Take a string as input, return the length of the String
		
		Function<String,Integer> stringLengthFinder= str -> str.length();
				
		System.out.println(stringLengthFinder.apply("Hyderabad"));
		
		Function<Integer,Integer>  doubleTheNumber = i -> i*2;	
		System.out.println(doubleTheNumber.apply(400));
		
		
		Function<Integer,Integer> add10 = i->i+10;
		
		//andThen()    and compose()
		
		Function<Integer,Integer> doubleThenAdd10 = doubleTheNumber.andThen(add10);
		
		System.out.println(doubleThenAdd10.apply(3));
		
		Function<Integer,Integer> add10ThenDouble = doubleTheNumber.compose(add10);
		
		System.out.println(add10ThenDouble.apply(10));
				
		
		
		
		
		
		
		
		
	}

}
