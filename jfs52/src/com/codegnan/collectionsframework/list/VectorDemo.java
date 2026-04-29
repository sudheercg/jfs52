package com.codegnan.collectionsframework.list;

import java.util.Vector;

public class VectorDemo {
	
	
	public static void main(String[] args) {
		
		Vector<String> names = new Vector<>();
		
		names.add("Ram");
		names.add("Shaik");
		names.add("John");
		
		System.out.println("Vector: "+names);
		
		//update
		names.set(1,"Krishna");
		System.out.println(names);
		
		// get(index):to access elements
		System.out.println("First element: "+names.get(0));
		
		// remove
		names.remove("John");
		
		//size()
		System.out.println("Size"+ names.size());
		System.out.println("Capacity: "+names.capacity());
	}

}
