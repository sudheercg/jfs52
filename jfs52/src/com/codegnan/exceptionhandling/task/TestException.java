package com.codegnan.exceptionhandling.task;

public class TestException {
	
	public static void main(String[] args) {
		
		Person person = new Person(11,"Raj");
		
		try {
		person.checkEligibility();
		}catch(InvalidAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
