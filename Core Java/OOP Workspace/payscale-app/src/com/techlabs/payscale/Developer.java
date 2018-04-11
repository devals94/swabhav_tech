package com.techlabs.payscale;

public class Developer extends Employee {

	public Developer(int empno, String empname, float basicSalary) {
		super(empno, empname, basicSalary);
	}

	@Override
	public float totalSalary() {
		return getPa() * 12;
	}

	public float getPa() {
		return 0.4f * basicSalary;
	}
}
