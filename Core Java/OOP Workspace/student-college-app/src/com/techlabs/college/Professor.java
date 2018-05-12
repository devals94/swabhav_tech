package com.techlabs.college;

import java.util.List;

public class Professor extends Person implements SalariedEmployee{
	private float salary;

	private int noOfHoursWorked;

	public Professor(int id, String address, String dateOfBirth, int hours) {
		super(id, address, dateOfBirth);
		this.noOfHoursWorked = hours;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getNoOfHoursWorked() {
		return noOfHoursWorked;
	}

	@Override
	public float calculateSalary(List<Professor> professor) {
		for (Professor p : professor) {
			p.setSalary(p.getNoOfHoursWorked() * 200);
		}
		return getSalary();
	}

}
