package com.techlabs.payscale;

public class Accountant extends Employee {
	
	public Accountant(int empno, String empname, float basicSalary) {
		super(empno, empname, basicSalary);
	}

	@Override
	public float totalSalary() {
		return getPerks() * 12;
	}

	public float getPerks() {
		return 0.3f * basicSalary;
	}
}
