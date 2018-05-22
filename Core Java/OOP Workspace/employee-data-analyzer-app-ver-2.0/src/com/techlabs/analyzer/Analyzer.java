package com.techlabs.analyzer;

import java.util.Set;

import com.techlabs.employee.Employee;

public class Analyzer {

	Set<Employee> emp;

	public Analyzer(Set<Employee> empValuesList) {
		emp = empValuesList;
	}

	public String getMaxSalariedEmployee() {
		int max = 0;
		String result = "";
		for (Employee e : emp) {
			if (e.getEmpSalary() > max) {
				result = "Id: " + e.getEmpId() + " Name:" + e.getEmpName()
						+ " Salary: " + e.getEmpSalary() + " Dept Number: "
						+ e.getEmpDeptNumber();
			}
		}
		return result;
	}

	public String numberOfEmployeesBasedOnDesignation() {
		int manager = 0;
		int clerk = 0;
		int salesman = 0;
		int president = 0;
		int analyst = 0;
		for (Employee e : emp) {
			if (e.getEmpDesignation().equalsIgnoreCase("\'MANAGER\'"))
				manager++;
			if (e.getEmpDesignation().equalsIgnoreCase("\'CLERK\'"))
				clerk++;
			if (e.getEmpDesignation().equalsIgnoreCase("\'SALESMAN\'"))
				salesman++;
			if (e.getEmpDesignation().equalsIgnoreCase("\'PRESIDENT\'"))
				president++;
			if (e.getEmpDesignation().equalsIgnoreCase("\'ANALYST\'"))
				analyst++;
		}
		return "Manager: " + manager + "\nAnalyst: " + analyst + "\nClerk: "
				+ clerk + "\nSalesman: " + salesman + "\nPresident: "
				+ president;
	}

	public String numberOfEmployeesBasedOnDeptNumber() {
		int ten = 0;
		int twenty = 0;
		int thirty = 0;
		for (Employee e : emp) {
			if (e.getEmpDeptNumber() == 10)
				ten++;
			if (e.getEmpDeptNumber() == 20)
				twenty++;
			if (e.getEmpDeptNumber() == 30)
				thirty++;
		}
		return "Dept Number:10 has " + ten + " members" + "\nDept Number:20 has " + twenty + " members" + "\nDept Number:30 has " + thirty + " members";

	}
}
