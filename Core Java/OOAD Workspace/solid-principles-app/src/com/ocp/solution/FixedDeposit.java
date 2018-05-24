package com.ocp.solution;

public class FixedDeposit implements IRate {
	private int accountNo;
	private String name;
	private double principal;
	private float years;
	private IRate fixedRate;

	public FixedDeposit(int accountNo, String name, double principal,
			float years, IRate rate) {
		this.accountNo = accountNo;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.fixedRate = rate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public float getYears() {
		return years;
	}

	@Override
	public double rate() {
		return fixedRate.rate();
	}

	public double calculateSimpleInterest() {
		double interest = (getPrincipal() * rate() * getYears()) / 100;
		return interest;
	}
}