package com.codegnan.java8enhancements.predefinedfi;

import java.util.function.Supplier;

public class SupplierDemo {
	
	
	public static void main(String[] args) {
		
		Supplier<String> greetingSupplier=()->"Welcome to my application";
		
		String message = greetingSupplier.get();
		
		System.out.println(message);
		
		
		
	}

}
