package com.codegnan.oop.principles.association;

public class Person {
	
	String personName; 
	
	Passport passport;//USES-A RELATIONSHIP 
	
	
	Person(String personName, Passport passport){
		
		this.personName=personName;
		this.passport = passport;
				
		
	}


	@Override
	public String toString() {
		return "Person [personName=" + personName + ", passport=" + passport + "]";
	}
	
	/*
	 * void display() {
	 * 
	 * }
	 */
	
	/*
	 * public String toString() { return personName+" "+ passport.passportID; }
	 */

}
