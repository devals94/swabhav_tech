package com.techlabs.accountpolym;

public abstract class Account {
	
	private int accno;
	private String name;
	protected float balance;
	
	public Account(int accno, String name, float balance){
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}
	
	public void deposit(float balance){
		this.balance += balance; 
	}
	
	public abstract void withdraw(float balance);
		
}
