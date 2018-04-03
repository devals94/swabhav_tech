package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101,"Steve",2000);
		acc1.deposit(500);
		acc1.withdraw(1000);
		displayDetails(acc1);
		
		Account acc2 = new Account(102, "John");
		acc2.deposit(500);
		acc2.withdraw(1500);
		displayDetails(acc2);
	}
	
	public static void displayDetails(Account acc){
		System.out.println("Account Number: " + acc.getAccno());
		System.out.println("Account Holder Name: " + acc.getName());
		System.out.println("Account Balance: " + acc.getBalance());
		System.out.println();
	}
}
