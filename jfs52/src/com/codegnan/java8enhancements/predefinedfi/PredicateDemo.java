package com.codegnan.java8enhancements.predefinedfi;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		
		//boolean test(T t);

		Predicate<Integer>  isPositive= (num)-> num >0;
		
		boolean result = isPositive.test(-23);
		System.out.println(result);
		
		
		Predicate<String> isLengthGreaterThan5=
				(str)-> str.length()>5;		
       System.out.println(isLengthGreaterThan5.test("Code"));
       
         Predicate<Integer> isEven = (num)-> num%2==0;
         
          System.out.println(isEven.test(21));
	}

}
