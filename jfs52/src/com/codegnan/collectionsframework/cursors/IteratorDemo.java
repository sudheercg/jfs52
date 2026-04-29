package com.codegnan.collectionsframework.cursors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {
	
	
	public static void main(String[] args) {
	
		Set<String> namesList = new HashSet<>(); 
		namesList.add("India");
		namesList.add("USA");
		namesList.add("Japan");
		namesList.add("Japan");
		namesList.add("Malaysia");
		
		System.out.println("Before remove: "+ namesList);		
		//Iterator
		   Iterator iterator = namesList.iterator();   
		   //hasNext(), next()	   
		   while(iterator.hasNext()) {
			   if(iterator.next() == "Japan") {   
				   iterator.remove();		   
			   }
			   
		   }
		   
		   System.out.println(namesList);
		
		
	}

}
