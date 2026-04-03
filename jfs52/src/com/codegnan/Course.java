package com.codegnan;

public class Course {
	
	String courseName;//default null
	double courseFee;// default 0.0
	int courseDuration; //0
	
	
	//Course(){}
    Course(){
		System.out.println("Course Object created");
	}
    
    //this keyword refers the current object
    Course(String courseName, double courseFee, int courseDuration){    	
      this.courseName=courseName;
      this.courseFee=courseFee;
      this.courseDuration =courseDuration;
    }
    
    Course(String c,double f){
    	courseName=c;
    	courseFee=f; 
    }
    
    Course(String c){
    	courseName =c;
    }
    
    public void displayCourseDetails(Course course) {
    	System.out.println("CourseName: "+course.courseName);
    	System.out.println("Course Fee: "+course.courseFee);
    	System.out.println("Course Duration: "+course.courseDuration);
    	System.out.println();
    }
	
	
	public static void main(String[] args) {
		
		Course course = new Course("Java",50000.00,100);
		course.displayCourseDetails(course);
		
		Course course1 = new Course("Python",60000.00,150);
		course.displayCourseDetails(course1);
	
	}

}

// Create a class Person - Id, Name, Age
//Create a no arg constructor and parameterized constructor to initialize  Person object
// Create objects using no-arg constructor and parameterized constructor. 







