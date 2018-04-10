package com.techlabs.accountpolym.test;

import com.techlabs.accountpolym.Account;
import com.techlabs.accountpolym.CurrentAccount;
import com.techlabs.accountpolym.SavingsAccount;

public class AccountTest {
	public static void main(String[] args) {
		CurrentAccount ca = new CurrentAccount(100,"Steve",5000);
		ca.deposit(5000);
		printDetails(ca);
		ca.withdraw(15000);
		printDetails(ca);
		ca.withdraw(5000);
		printDetails(ca);
		
		SavingsAccount sa = new SavingsAccount(1000,"Rahul",11000);
		sa.deposit(4000);
		printDetails(sa);
		sa.withdraw(15000);
		printDetails(sa);
	}
	
	public static void printDetails(Account a){
		System.out.println("Account Type: " + a.getClass().getSimpleName());
		System.out.println("Account Number: " + a.getAccno());
		System.out.println("Account Holder Name: " + a.getName());
		System.out.println("Account Balance: " + a.getBalance());
		System.out.println();
	}
}
