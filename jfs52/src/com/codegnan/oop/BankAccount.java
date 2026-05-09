package com.codegnan.oop;

public class BankAccount {

	//instance variables
	private String accountHolderName;
	private double balance; 
	
	private final double interestRate =5.5;
	
	
	//getter  - accessors
	public final double getBalance() {
		return balance; 
	}
	
	
	public void withDraw(double amount) {
		if(balance>=amount) {
			balance = balance-amount;
		}
		else {
			System.out.println("Insufficient funds!");
		}
	
		
	}
	
	public void deposit(double amount) {
		
	//	interestRate =10;
		
		if(amount>0) {
			balance= balance+amount;
		}else {
			System.out.println("Invalid deposit anount");
		}
	}
	
	
	
	
	//setter  - mutator
	public void setBalance(double balance) {
		if(balance<=0) {
			System.out.println("Invalid balance");
		}
		else {
		this.balance=balance;
		}
	}
	
	
	
		
			
			
			
		
	}


