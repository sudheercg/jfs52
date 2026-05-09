package com.codegnan.java8enhancements.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {

		//reduce() - combine all elements of a stream into a single result.  
		
		// it takes multiple values and reduces them toone value using a combining operation
		
		List<Integer> numList = Arrays.asList(1,2,3,4);
		
		int sum = numList.stream().reduce(0,(a,b)-> a+b);
		System.out.println(sum);
		/*
		 * intial value(identity) accumulator element 0 0 + 1 1 + 2 3 + 3 6 + 4
		 */
		
		//forEach()- iterate the elements
		numList.stream().forEach(n->System.out.println(n));
		
		
		  //collect() - is a terminal operation used to convert a stream into a collection.
	    List<String> namesList = Arrays.asList("Ali","Raj","Bose", "Sravan","John");
	    List<String> transformedList =
	    		namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		
		
		
		
	}

}
