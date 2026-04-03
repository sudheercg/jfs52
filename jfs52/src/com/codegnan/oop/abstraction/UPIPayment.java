package com.codegnan.oop.abstraction;

public class UPIPayment implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println("Paid "+amount+" UPI Payment");
	}
	
	@Override
	public void refund(double amount) {
		System.out.println("Refunded "+amount+ "to UPI");
	}

}
