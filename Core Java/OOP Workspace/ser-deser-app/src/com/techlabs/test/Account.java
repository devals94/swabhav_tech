package com.techlabs.test;

import java.io.Serializable;

public class Account implements Serializable {
	private final int accno;
	private final String name;
	private double balance;
	
	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int accno, String name) {
		this(accno, name, 500);
	}

	public int getAccno() {
		return this.accno;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double balance) {
		this.balance = this.balance + balance;
	}

	public void withdraw(double balance) {
		if ((this.balance - 500) <= 500) {
			System.out.println("Cannot withdraw to maintain minimum balance");
			return;
		}
		this.balance = this.balance - balance;
	}
}
