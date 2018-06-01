package com.techlabs.analyzer;

import java.io.IOException;
import java.util.Set;

import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.loader.UrlLoader;
import com.techlabs.parser.SourceParser;

public class EmployeeDataAnalyzer {
	public static void main(String[] args) throws IOException {
		String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\employee-data-analyzer-app-ver-1.0\\src\\com\\techlabs\\test.txt";
		String url = "https://swabhav-tech.firebaseapp.com/emp.txt";

		FileLoader fileLoader = new FileLoader(path);
		UrlLoader urlLoader = new UrlLoader(url);

		SourceParser parser = new SourceParser(fileLoader);// you can give
															// fileLoader also.
		Set<Employee> empValuesList = parser.getEmployeeRecords();
		System.out.println("Total Number of Employees are: " + empValuesList.size());
		Analyzer a = new Analyzer(empValuesList);
		System.out.println("\nMaximum Salaried Employee is: \n"
				+ a.getMaxSalariedEmployee());
		System.out
				.println("\nNumber of Employees based on their designation are: \n"
						+ a.numberOfEmployeesBasedOnDesignation());
		System.out
				.println("\nNumber of Employees based on their departments are: \n"
						+ a.numberOfEmployeesBasedOnDeptNumber());

	}
}
