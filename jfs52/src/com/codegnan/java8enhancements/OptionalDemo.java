package com.codegnan.java8enhancements;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		
		User user = new User(new Address("Hyderabad"));

		
		String result = Optional.ofNullable(user).map(u->u.getAddress())
		                        .map(a->a.getCity())
		                        .orElse("Value is missing");
		                        
		
		
	}

}
