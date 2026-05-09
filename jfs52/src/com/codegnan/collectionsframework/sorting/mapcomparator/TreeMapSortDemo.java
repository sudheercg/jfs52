package com.codegnan.collectionsframework.sorting.mapcomparator;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapSortDemo {
	
	public static void main(String[] args) {
		
		//TreeMap<Employee,Character> empMap =  new TreeMap<>(new IdComparator());
		TreeMap<Employee,Character> empMap =  new TreeMap<>(new NameComparator().reversed());
		
		empMap.put(new Employee(100,"Raj",32), 'A');
		empMap.put(new Employee(20,"Suman",21), 'B');
		empMap.put(new Employee(32,"Kanna",22), 'C');
		empMap.put(new Employee(32,"Anand",22), 'C');

		
		for(Entry<Employee, Character> entry:empMap.entrySet()) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		
		
		
	}

}
