package com.techlabs.parser;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.techlabs.employee.Employee;
import com.techlabs.loader.FileLoader;
import com.techlabs.loader.UrlLoader;

public class SourceParserTest {
	public static void main(String[] args) throws IOException {
		//String path = "D:\\CloudSWTL\\Core Java\\OOP Workspace\\employee-data-analyzer-app-ver-1.0\\src\\com\\techlabs\\test.txt";
		//String url = "https://swabhav-tech.firebaseapp.com/emp.txt";
		//printSet(sp.parser(new FileLoader(path).getContentsFromSource()));
		//printSet(sp.parser(new UrlLoader(url).getContentsFromSource()));
		//printSet(sp.getEmployeeRecords((new UrlLoader(url).getContentsFromSource())));
	}
	
	public static void printSet(Set<Employee> parseList){
		for(Employee cleanData: parseList){
			System.out.println(cleanData.getEmpSalary());
		}
	}
}
