package com.codegnan.java8enhancements.lambdaexpressions;

public class CalculatorImplementation {

	/*
	 * public int calculate(int a, int b) {
	 * 
	 * return a+b; 
	 * }
	 */

	public static void main(String[] args) {

		Calculator product = (first, second) -> first * second;
		System.out.println(product.calculate(20, 10));
		
		Calculator addition = (x,y)-> x+y;
		System.out.println(addition.calculate(100, 200));
		
		
		
		

	}

}


