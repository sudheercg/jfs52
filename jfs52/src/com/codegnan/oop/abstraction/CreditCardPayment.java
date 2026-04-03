package com.codegnan.oop.abstraction;

public class CreditCardPayment  implements Payment {

	@Override
	public void pay(double amount) {
	
		System.out.println("Paid "+amount+ " using Credit card");
		
	}

	@Override
	public void refund(double amount) {

		System.out.println("Refunded "+amount+" to Credit Card");
		
	}

	
	
	
}
