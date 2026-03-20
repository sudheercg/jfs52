package com.codegnan.methods;

class BankAccount{
	
   //instance variables
   String accountHolderName;
   String accountNumber;
   double balance; 


  //method to display the account details
   //  method with no arguments and no return type
  public  void displayAccountDetails(){
   System.out.println("Account Holder name: "+accountHolderName);
   System.out.println("Account Number: "+ accountNumber);
   System.out.println("Balance: "+ balance);
  }


// a method with no arguments and 
  public double getBalance(){

   return balance; 
  }

  public String getAccountHolderName(){

  	return accountHolderName;
  }


  public String getAccountNumber(){
  	return accountNumber;
  }


// a method with arguments and without return type.
  public void deposit(double amount){
    System.out.println("You are trying to deposit Rs."+amount);
    balance= balance+amount; 
  }

  public void withdraw(double amount){
    System.out.println("You are trying to withdraw Rs."+amount);
    balance = balance-amount; 
  }


  public boolean isBalanceAvaialable(double amount){

    if(amount<= balance){
      return true; 
    }else{
     return false;
    }
    
  }

  public String withDrawEligiblity(double amount){

    System.out.println("You are tryibg to withdraw  "+amount);

       if(isBalanceAvaialable(amount)){

          return "Eligible to Withdraw";
       }
       else{
         return "Not Eligible to withdraw amount ";
       }



  }


  


  public static void main(String args[]){

      BankAccount bankAccount = new BankAccount();
      bankAccount.accountHolderName="Raj Kumar";
      bankAccount.accountNumber="9876543212";
      bankAccount.balance=10000.00;


      bankAccount.displayAccountDetails();

      double accBalance= bankAccount.getBalance();
      System.out.println("Balance: "+accBalance);


      String accountHolderName= bankAccount.getAccountHolderName();
     System.out.println(bankAccount.getAccountHolderName());

     //deposit 550 to bank account
     bankAccount.deposit(1000.00);
     System.out.println("Updated Balance: "+ bankAccount.getBalance());


     bankAccount.withdraw(2000.00);
     System.out.println("Updated balance after withdrawl: "+ bankAccount.getBalance());



    /* boolean isValid = bankAccount.isBalanceAvaialable(1000.00);
      if(isValid){

        System.out.println("You have sufficient balance to withdraw");

      }else{
        System.out.println("You do not have sufficient balance to withdraw");
      }  */

       String result = bankAccount.withDrawEligiblity(5000.00);
       System.out.println(result);


  }








}