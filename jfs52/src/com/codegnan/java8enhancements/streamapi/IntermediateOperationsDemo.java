package com.codegnan.java8enhancements.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsDemo {

	public static void main(String[] args) {

		/*ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(20);
		*/
		
		//Collection of the type List
		List<Integer> numbers = Arrays.asList(100,20,20,250,1,300,250);
		
		//Create Stream object from Collection
	    Stream<Integer> stream=	numbers.stream();
	    
	    //Use intermediate operation filter() and terminal operation collect()
	    //filter() - selects the elements based on a condition
	    List<Integer> evenNumbers =stream.filter(n->n%2==0).collect(Collectors.toList());
		
	    System.out.println(evenNumbers);
	    
	    //map() - to transform each element of the stream 
	    List<String> namesList = Arrays.asList("Ali","Raj","Bose", "Sravan","John");
	    List<String> transformedList =
	    		namesList.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
	    //limit
	    
	    List<String> limitedList= transformedList.stream().limit(3).collect(Collectors.toList());
	    
	    System.out.println(limitedList);
	    
	    //sorted()
		List<Integer> result = numbers.stream().filter(n->n%2==0).distinct().
				map(n->n*10).sorted().collect(Collectors.toList());
		
		System.out.println(result);
		

		
		
	}

}
