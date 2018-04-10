package com.techlabs.accountpolym;

public class SavingsAccount extends Account {

	public SavingsAccount(int accno, String name, float balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(float amountToWithdraw) {

		if (this.balance - amountToWithdraw < 1000) {
			System.out
					.println("Cannot Withdraw.Violates Minimum Balance Condition of Rs 1000/-");
		} else
			this.balance = this.balance - amountToWithdraw;
	}

}
