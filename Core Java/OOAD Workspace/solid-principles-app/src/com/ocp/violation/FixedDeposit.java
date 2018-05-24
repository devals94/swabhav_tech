package com.ocp.violation;

public class FixedDeposit {
	private int accountNo;
	private String name;
	private double principal;
	private float years;
	private FestivalType festival;

	public FixedDeposit(int accountNo, String name, double principal,
			float years, FestivalType festival) {
		this.accountNo = accountNo;
		this.name = name;
		this.principal = principal;
		this.years = years;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}

	private double getRate() {
		double rate = 0;
		if (this.festival == FestivalType.HOLI) {
			rate = 0.08;
		} else if (this.festival == FestivalType.NORMAL) {
			rate = 0.07;
		} else if (this.festival == FestivalType.NEW_YEAR) {
			rate = 0.09;
		}
		return rate;
	}

	public double calculateSimpleInterest() {
		double interest = (getPrincipal() * getRate() * getYears()) / 100;
		return interest;
	}

}