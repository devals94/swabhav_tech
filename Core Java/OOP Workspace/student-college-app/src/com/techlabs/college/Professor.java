package com.techlabs.college;

public class Professor extends Person {
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

}
