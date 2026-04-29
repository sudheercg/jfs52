package com.codegnan.collectionsframework.sorting.setcomparator;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		//Set<Employee> empSet = new TreeSet<>(new IdComparator().reversed());
		//Set<Employee> empSet = new TreeSet<>(new NameComparator());
		Set<Employee> empSet = new TreeSet<>(new NameComparator().reversed());	
		empSet.add(new Employee(100,"Raj",32));
		empSet.add(new Employee(101,"John",24));
		empSet.add(new Employee(10,"Kishor",55));
		empSet.add(new Employee(200,"Ram",20));
	
		
		for(Employee e:empSet) {
			System.out.println(e);
		}
	}

}
