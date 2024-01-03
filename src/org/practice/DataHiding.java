package org.practice;

public class DataHiding {

	 public static void main(String[] args) {
	        // Creating a bank account
	        BankAccount myAccount = new BankAccount("123456789", 100000.0);

	        // Accessing account details through public methods
	        System.out.println("Account Number: " + myAccount.getAccountNumber());
	        System.out.println("Initial Balance: " + myAccount.getBalance());

	        // Making a deposit
	        myAccount.deposit(15000.0);

	        // Making a withdrawal
	        myAccount.withdraw(20000.0);
	    }
	
}


