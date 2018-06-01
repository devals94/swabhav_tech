package com.techlabs.employee;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private String empDesignation;
	private String managerId;
	private String dateOfJoining;
	private int empSalary;
	private String empCommission;
	private int empDeptNumber;

	public Employee(int empId, String empName, String empDesignation,
			String managerId, String dateOfJoining, int empSalary,
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

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpCommission() {
		return empCommission;
	}

	public void setEmpCommission(String empCommission) {
		this.empCommission = empCommission;
	}

	public int getEmpDeptNumber() {
		return empDeptNumber;
	}

	public void setEmpDeptNumber(int empDeptNumber) {
		this.empDeptNumber = empDeptNumber;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empDesignation=" + empDesignation + ", managerId="
				+ managerId + ", dateOfJoining=" + dateOfJoining
				+ ", empSalary=" + empSalary + ", empCommission="
				+ empCommission + ", empDeptNumber=" + empDeptNumber + "]";
	}
	
	
}
