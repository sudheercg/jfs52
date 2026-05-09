package com.codegnan.oop.inheritance;


//parent class
public class BankAccount {
	
  String accountNumber;
  String accountHolderName; 
  double balance; 
  
  BankAccount(String accountNumber, String accountHolderName, double balance){
	  
	  this.accountNumber=accountNumber;
	  this.accountHolderName=accountHolderName;
	  this.balance=balance; 
	  
  }
  
  void deposit(double amount) {
	  balance = balance+amount;
  }
  
  void withdraw(double amount) {
	  balance = balance-amount;
  }
  
  public void displayAccountDetails() {
	  System.out.println("Account Number: "+ accountNumber);
	  System.out.println("Account Holder Name: "+ accountHolderName);
	  System.out.println("Account Balance: "+balance);
  }
  
  
	
	

}
