package com.techlabs.payscale;

abstract public class Employee {
	private int empno;
	private String empname;
	protected float basicSalary;

	public Employee(int empno, String empname, float basicsalary) {
		this.empno = empno;
		this.empname = empname;
		this.basicSalary = basicsalary;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEmpname() {
		return empname;
	}

	public float getBasicsalary() {
		return basicSalary;
	}
	
	public abstract float totalSalary();
}
