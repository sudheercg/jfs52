package com.codegnan.exceptionhandling.task;

public class Person {
	
  int age;
  String name;
  
  Person(int age, String name){
	  this.age=age;
	  this.name=name; 
  }
  
  public void checkEligibility() throws InvalidAgeException {
	  
	  if(age<18) {
		  throw new InvalidAgeException("You do not have sufficient age to vote");
	  }
	  else {
		  System.out.println("You are eligible to vote");
	  }
	  
  }
	

}
