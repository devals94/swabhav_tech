package com.techlabs.employee;

public class EmployeeDetails {
	private int empId;
	private String empName;
	private String empDesignation;
	private int managerId;
	private String dateOfJoining;
	private int empSalary;
	private String empCommission;
	private int empDeptNumber;

	public EmployeeDetails(int empId, String empName, String empDesignation,
			int managerId, String dateOfJoining, int empSalary,
			String empCommission, int empDeptNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.empSalary = empSalary;
		this.empCommission = empCommission;
		this.empDeptNumber = empDeptNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public String getEmpCommission() {
		return empCommission;
	}

	public int getEmpDeptNumber() {
		return empDeptNumber;
	}

	
}
