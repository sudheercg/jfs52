package com.codegnan.java8enhancements.methodreferences;

public class Student {
	
	String name; 
	
	Student(String name){
		this.name=name;
		
	}

	
	void display() {
		System.out.println("Name: "+name);
	}
	
	
}
