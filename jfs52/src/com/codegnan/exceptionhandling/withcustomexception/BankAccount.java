package com.codegnan.exceptionhandling.withcustomexception;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        //Only using if condition
        if (amount > balance) {
        		throw new InsufficientBalanceException("You do not have sufficient balance to withdraw, please check your balance");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}