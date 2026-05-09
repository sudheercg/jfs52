package com.codegnan.collectionsframework.sorting;

public class Employee implements Comparable<Employee>{	
	int id;
	String name;
	int age;
	
	public Employee(int id, String name, int age) {
		this.id =id;
		this.name=name; 
		this.age=age;
	}

	@Override
	public String toString() {
		return "Employee id=" + id +", age=" + age +", name=" + name;
	}
	/*
	 public int compareTo(Employee o) {		 
		 return Integer.compare(this.id,o.id);	 
	 }
	 */
	 /*public int compareTo(Employee o) {		 
		 return Integer.compare(this.age,o.age);	 
	 }*/
	
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
	
	

}
