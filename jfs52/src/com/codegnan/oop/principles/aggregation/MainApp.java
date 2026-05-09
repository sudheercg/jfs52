package com.codegnan.oop.principles.aggregation;

public class MainApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Raj");
		Employee e2 = new Employee(102,"Kumar");
		
		//Department d1 = new Department("IT",e2 );
		
		
		//d1.displayDepartment();
		e1.displayEmployee();
		
	}

}
