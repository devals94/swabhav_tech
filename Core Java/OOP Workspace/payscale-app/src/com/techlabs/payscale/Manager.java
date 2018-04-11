package com.techlabs.payscale;

public class Manager extends Employee {

	public Manager(int empno, String empname, float basicSalary) {
		super(empno, empname, basicSalary);
	}

	@Override
	public float totalSalary() {
		return (getHra() + getDa() + getTa()) * 12;
	}

	public float getHra() {
		return 0.5f * basicSalary;
	}

	public float getDa() {
		return 0.3f * basicSalary;
	}

	public float getTa() {
		return 0.4f * basicSalary;
	}

}
