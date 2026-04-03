package com.codegnan.oop.abstraction;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("=============Savings Account Test===============");
        SavingsAccount sa = new SavingsAccount("SA123",5000);
        
        sa.deposit(2000);
        sa.withdraw(3000);
	    sa.withdraw(3000);
	    
	    System.out.println("============Current Account=============");
	    CurrentAccount ca = new CurrentAccount("CA123",2000);
	    	ca.deposit(1000);//balance is 3000
	    	ca.withdraw(5000);//
	    	ca.withdraw(4000);
	
	}

}
