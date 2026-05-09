package com.codegnan.oop.abstraction;

public class SavingsAccount extends BankAccount {

	final double  MIN_BALANCE =1000;
	
	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void withdraw(double amount) {
		if(balance-amount>=MIN_BALANCE) {
			balance= balance-amount;
			System.out.println("Withdrawl successful, Remaining balance is "+balance);
		}else {
			System.out.println("Withdrawl denied, Minimum balance of "+MIN_BALANCE+ "must be maintained");
		}
	}
	
}
