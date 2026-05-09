package com.codegnan.exceptionhandling.withcustomexception;

public class Test {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(10000);

        try {
			acc.withdraw(15000);
		} catch (InsufficientBalanceException e) {
			
		//	e.printStackTrace();
			
			System.out.println("Error: "+e.getMessage());
		} // invalid
        System.out.println("Transaction completed");
    }
}