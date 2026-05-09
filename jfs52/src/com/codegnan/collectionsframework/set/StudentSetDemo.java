package com.codegnan.collectionsframework.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSetDemo {
	
	
	public static void main(String[] args) {
		
		Set<Student> studentSet = new LinkedHashSet<>();
		
		studentSet.add(new Student(1,"Raj"));
		studentSet.add(new Student(2,"Kumar"));
		studentSet.add(new Student(3,"Akash"));
		studentSet.add(new Student(1,"Raj"));

		for(Student student: studentSet) {
			System.out.println(student);
		}

		
		
		
	}

}
