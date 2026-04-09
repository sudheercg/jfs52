package com.codegnan.oop.principles.association;

public class Student {
	
	
	String name; 
	
	//User defined type
	Course course; //association USES-A relationship
	
	Laptop laptop; //association USES-A relationship
	
	
	// Student uses Course and Laptop - Association 
	Student(String name, Course course, Laptop laptop){
		
		this.name=name;
		this.course  = course;
		this.laptop=laptop; 
		
	}
	
	void display(){
		System.out.println("Student Name: "+name + " "+"Course: " 
				+ course.courseName+"Laptop Name: "+laptop.laptopName);
	}

}
