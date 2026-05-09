package com.codegnan.java8enhancements;

public class Demo02 {
	
	
	public static void main(String[] args) {
		
	//	Address address = new Address("Hyderabad");
		
		//User user = new User(null);
		User user = new User(new Address("Hyderabad"));
		
		//System.out.println(user.getAddress().getCity());

		
		  if(user!=null && user.getAddress() !=null) {
			  System.out.println(user.getAddress().getCity()); 
		  } else {
			  System.out.println("Null value passed"); 
		  }
		 
		
		
	}

}
