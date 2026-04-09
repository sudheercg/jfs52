package com.codegnan.oop.principles.aggregation;

public class Employee {
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId=empId;
		this.empName= empName;
	}
	
	public void displayEmployee() {
		System.out.println("Employee ID: "+empId);
		System.out.println("EmployeeName: "+empName);
	}

}
