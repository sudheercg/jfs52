package com.codegnan.oop.principles.aggregation;

public class Department {
	
	String deptName;
	Employee employee; 
	
	public Department(String deptName,Employee employee) {
		this.deptName=deptName; 
		this.employee=employee;
	}
	
	public void displayDepartment() {
		
		System.out.println("DepartmentName: "+deptName);
		employee.displayEmployee();
	}

}
