package com.codegnan.oop.abstraction;

interface Payment {
	
	String PAYMENT_BANK= "DBS";
	
	void pay(double amount);
	void refund(double amount);

}
