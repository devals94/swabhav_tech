package com.techlabs.accountpolym;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, float balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(float balance) {
		float amount = 0.0f;
		try {
			if (getBalance() > -5000) {
				amount = this.balance - balance;
				if (amount < -5000) {
					// System.out.println("Insufficient balance");
					RuntimeException re = new RuntimeException(
							"Insufficient Balance");
					throw re;

				} else {
					this.balance -= balance;
				}
			} else {
				// System.out.println("Insufficient balance");
				RuntimeException re = new RuntimeException(
						"Insufficient Balance");
				throw re;
			}
		} catch (RuntimeException e) {
			System.out.println(e);
		}
	}

}
