package com.codegnan.collectionsframework.sorting.mapcomparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		
		return Integer.compare(e1.id, e2.id);
	}
	

}
//Create a class Employee
//Create a TreeMap and insert employee objects
//Sort the employee objects by ID.

