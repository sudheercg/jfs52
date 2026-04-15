package com.codegnan.exceptionhandling.withoutcustomexception;

public class Test {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(10000);

        acc.withdraw(15000); // invalid
        System.out.println("Transaction completed");
    }
}