package com.codegnan.collectionsframework.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(100,"Raj",32));
		empList.add(new Employee(101,"John",24));
		empList.add(new Employee(10,"Kishor",55));
		empList.add(new Employee(200,"Ram",20));
		//System.out.println(empList);
		
		Collections.sort(empList);
		
		for(Employee e:empList) {
			System.out.println(e);
		}
	}

}
