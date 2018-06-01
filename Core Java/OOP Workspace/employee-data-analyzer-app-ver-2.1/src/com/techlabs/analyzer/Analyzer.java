package com.techlabs.analyzer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.employee.Employee;

public class Analyzer {

	Set<Employee> employees;

	public Analyzer(Set<Employee> empValuesList) {
		employees = empValuesList;
	}

	public String getMaxSalariedEmployee() {
		int max = 0;
		String result = "";
		for (Employee e : employees) {
			// System.out.println(e);
			if (e.getEmpSalary() > max) {
				max = e.getEmpSalary();
				result = "Id: " + e.getEmpId() + " Name:" + e.getEmpName()
						+ " Salary: " + e.getEmpSalary() + " Dept Number: "
						+ e.getEmpDeptNumber();
			}
		}
		return result;
	}

	public Map<Integer, Integer> numberOfEmployeesBasedOnDeptNumber() {
		Map<Integer, Integer> deptMap = new HashMap<Integer, Integer>();
		for (Employee e : employees) {
			int key = e.getEmpDeptNumber();
			int count = deptMap.containsKey(key) ? deptMap.get(key) : 0;
			deptMap.put(key, count + 1);
		}
		return deptMap;
	}

	public Map<String, Integer> numberOfEmployeesBasedOnDesignation() {
		Map<String, Integer> designationMap = new HashMap<String, Integer>();
		for (Employee e : employees) {
			String designation = e.getEmpDesignation();
			int value = designationMap.containsKey(designation) ? designationMap
					.get(designation) : 0;
			designationMap.put(designation, value + 1);
		}
		return designationMap;
	}
}
