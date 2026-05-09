package com.codegnan.oop.abstraction;

public class PaymentTest {
	
	
	public static void main(String[] args) {
		
	//	UPIPayment upi = new UPIPayment(); 
		Payment upiPayment = new UPIPayment(); 
		upiPayment.pay(1000);
		upiPayment.refund(200);
		
		Payment ccPayment = new CreditCardPayment();
		ccPayment.pay(3000);
		ccPayment.refund(2000);
		
	}
	

}
