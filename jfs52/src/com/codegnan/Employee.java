package com.codegnan;

public class Employee {
	
	int id;
	String name; 
	double salary; 
	
	// method which takes Employee object as an argument
	public void displayEmployeeDetails(Employee e) {
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	
	
	// method which returns Employee object
	public Employee getEmployee(int id, String name, double salary) {
	    Employee emp = new Employee();
	    emp.id = id;
	    emp.name = name;
	    emp.salary = salary;
	    return emp;
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.id= 100;
		emp.name="Raj";
		emp.salary=20000.00;	
		emp.displayEmployeeDetails(emp);	
		
		Employee e = emp.getEmployee(101,"Kumar",300000.00);
		e.displayEmployeeDetails(e);
		
		//Stringarray eg: 
		String[]  strArray = new  String[3];
		//Employee Array
		
		Employee[] empArray = new Employee[2];
		
		System.out.println();
		Employee e1 = new Employee();
		e1.id=102;
		e1.name="Shanti";
		e1.salary=100000.00;
		
		Employee e2 = new Employee();
		e2.id=103;
		e2.name="Srujan";
		e2.salary=200000.00;
		
		empArray[0]=e1;
		empArray[1]=e2;
		
		//display Employee objects
		for(Employee employee:empArray) {
			System.out.println(employee.id);
			System.out.println(employee.name);
			System.out.println(employee.salary);
			System.out.println();
		}
	
	}

}
