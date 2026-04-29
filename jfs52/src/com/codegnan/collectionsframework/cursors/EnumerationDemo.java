package com.codegnan.collectionsframework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Hyderabad");
		v.add("Vizag");
		v.add("Vijayawada");
		
		Enumeration enumeration = v.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			
		}
		
		
		
		
	}
	

}
