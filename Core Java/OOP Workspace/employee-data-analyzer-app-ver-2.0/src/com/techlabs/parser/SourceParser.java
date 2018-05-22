package com.techlabs.parser;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.employee.Employee;
import com.techlabs.loader.ILoader;

public class SourceParser {
	private ILoader loader;
	Employee employee = new Employee();

	public SourceParser(ILoader load) {
		this.loader = load;
	}

	public Set<Employee> getEmployeeRecords() throws IOException {
		List<String> empLoadedList = loader.getContentsFromSource();
		Set<Employee> employeeRecords = new LinkedHashSet<Employee>();

		for (String empl : empLoadedList) {
			String[] attributes = empl.split(",");
			int id = Integer.parseInt(attributes[0]);
			String name = attributes[1];
			String designation = attributes[2];
			String managerId = attributes[3];
			String doj = attributes[4];
			int salary = Integer.parseInt(attributes[5]);
			String commission = attributes[6];
			int deptNumber = Integer.parseInt(attributes[7]);

			employee.setEmpId(id);
			employee.setEmpName(name);
			employee.setEmpDesignation(designation);
			employee.setManagerId(managerId);
			employee.setDateOfJoining(doj);
			employee.setEmpSalary(salary);
			employee.setEmpCommission(commission);
			employee.setEmpDeptNumber(deptNumber);

			Employee empRecordsList = new Employee(id, name, designation,
					managerId, doj, salary, commission, deptNumber);

			employeeRecords.add(empRecordsList);
			// System.out.println(id + " " + name + " " + designation + " "
			// + managerId + " " + doj + " " + salary + " " + commission
			// + " " + deptNumber);
		}
		return employeeRecords;
	}
}
