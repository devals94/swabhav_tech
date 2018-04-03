package com.techlabs.account;

public class Account {
	private final int accno;
	private final String name;
	private double balance;
	private static int count;

	public static int headCount() {
		return count;
	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		count = count + 1;
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

	public int getInstances() {
		return count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accno;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accno != other.accno)
			return false;
		if (Double.doubleToLongBits(balance) != Double
				.doubleToLongBits(other.balance))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Account that = (Account) obj;
		if (this.accno != that.accno)
			return false;
		if (!this.name.equals(that.name))
			return false;
		if (this.balance != that.balance)
			return false;
		return true;
	}*/
}
