package com.codegnan.oop.inheritance;


//child of BankAccount
public class SavingsAccount extends BankAccount {
	
	/*
	 * String accountNumber; 
	 * String accountHolderName; 
	 * double balance;
	 */
	  double interestRate;
	  
	   public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate){
		 
		  //initialized using super class constructor
		   super(accountNumber,accountHolderName,balance);
		   
		   this.interestRate=interestRate;//initialized using SavingsAccount constructor
		  
	  }
	 
  
		/*
		 * void deposit(double amount) { balance = balance+amount; }
		 * 
		 * void withdraw(double amount) { balance = balance-amount; }
		 */
	  
	  void addInterest() {
		  double interest= balance* interestRate/100;
		  balance = balance+interest; 
		  System.out.println("Interest added: "+interest);
	  }
	  
	  
	  //override
	 public void displayAccountDetails() {
		  
		 super.displayAccountDetails();
		 
		  System.out.println("Interest Rate: "+interestRate);
		  System.out.println();
	  }
	  
	
	  
	  

}
