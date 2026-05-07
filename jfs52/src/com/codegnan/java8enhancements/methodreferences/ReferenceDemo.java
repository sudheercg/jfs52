package com.codegnan.java8enhancements.methodreferences;

public class ReferenceDemo {
	
	
	public static void main(String[] args) {
		StudentFactory factory = (str)-> new Student(str);
		Student student =factory.create("Raj");
		student.display();
		
		
		//Constructor reference
		StudentFactory factory1 = Student::new;
		Student student1 = factory1.create("Raj Kumar");
		student1.display();
		
		
	}

}
