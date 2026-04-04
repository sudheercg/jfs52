package com.codegnan;

public class Student {

	int rollNo;
	String name;
	int age;

	static String institute = "Codegnan";

	Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public void getStudentDetails() {

		int classAverage = 10;
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(age);
		System.out.println(institute);
		System.out.println(classAverage);
	}

	public static void display() {

		System.out.println(institute);

	}

	public static void main(String[] args) {
		Student student = new Student(100, "Raj", 20);

		System.out.println(student.age);

		student.getStudentDetails();

		System.out.println(Student.institute);
		Student.display();

	}

}
