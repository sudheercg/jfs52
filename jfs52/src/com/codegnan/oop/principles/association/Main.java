package com.codegnan.oop.principles.association;

public class Main {
	
	public static void main(String[] args) {
		
		Course course = new Course("Java");
		Laptop laptop = new Laptop("MacBook");
		Student student = new Student("Raj", course,laptop);//USES -A  relationship
		student.display();
		
		
		Passport passport = new Passport("EK12345");
		Person person = new Person("Raj",passport);
		System.out.println(person);
		
	}

}
