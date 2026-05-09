package com.codegnan.oop.principles.association;

public class Passport {
	
	

	String passportID; 
	
	public Passport(String passportID) {
		this.passportID=passportID;
	}
	
	@Override
	public String toString() {
		return "Passport [passportID=" + passportID + "]";
	}

}
