package com.codegnan.oop.inheritance;

public class BankDemo {
	
	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("63636363","Raj",10000.00, 10);
		sa.displayAccountDetails();
		
		/*
		 * CurrentAccount ca = new CurrentAccount("4848484","Sai",10000.00);
		 * ca.displayAccountDetails();
		 */
	}

}
