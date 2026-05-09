package com.codegnan.oop.abstraction;

public class CurrentAccount extends BankAccount {
	
	final double OVERDRAFT_LIMIT=-5000;
	
	public CurrentAccount(String accountNumber, double balance)
	{
		super(accountNumber, balance);
	}
	
	public void withdraw(double amount) {
		
		if(balance-amount>=OVERDRAFT_LIMIT) {
			balance= balance-amount;
			System.out.println("Withdrawl successful, Current balance: "+balance);
		}else {
			System.out.println("Withdrawl dernied");
		}
	}
	
}
