package com.codegnan.exceptionhandling.withoutcustomexception;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {

        //Only using if condition
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return; // manually stopping
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}