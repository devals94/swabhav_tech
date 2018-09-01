package com.techlabs.builder;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.techlabs.employee.Employee;

public class DisplayOrganizationalHeirarchy {
	String parseContent = "\n";
	
	public void printReportees(Employee employee, int level) {
		for (Employee emp : employee.getReportees()) {
			System.out.println(String.format("%" + level + "s",
					emp.getEmployeeName()));
			printReportees(emp, level + 8);
		}
	}

	public void display(OrganizationBuilder builder) throws FileNotFoundException, IOException {
		Employee CEO = 	builder.getCEO();
		System.out.println(CEO.getEmployeeName());
		printReportees(CEO, 10);
	}
	
	public String parseToXML(OrganizationBuilder builder) throws FileNotFoundException, IOException{
		Employee CEO = builder.getCEO();
		String content;
		content = "<Employees>";
		content += "\n<Employee name=" + CEO.getEmployeeName() + ">";
		content += parseReportees(CEO);
		content += "</Employee>";
		content += "\n</Employees>";
		return content;
	}
	
	public String parseReportees(Employee employee) {
		for (Employee emp : employee.getReportees()) {
			
			parseContent += "<reportees><Employee name=" + emp.getEmployeeName() + ">\n";
			if (emp.getReportees().size() > 0) {
				parseReportees(emp);
			}
			parseContent += "</Employee>\n</reportees>\n";
		}
		return parseContent;
	}
	
	public void saveToXML(String fileName,OrganizationBuilder builder) {
		try {
			FileWriter filewriter = new FileWriter(fileName + ".xml");
			filewriter.write(parseToXML(builder));
			filewriter.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}