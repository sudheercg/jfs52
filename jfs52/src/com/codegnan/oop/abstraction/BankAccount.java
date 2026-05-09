package com.codegnan.oop.abstraction;

public abstract class BankAccount {
	
	String accountNumber;
	double balance; 
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance=balance; 
	}
	
	//concrete method
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance+amount; 
			System.out.println(amount+" deposited, current balance: "+balance);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	//abstract method
	abstract void withdraw(double amount);

}
