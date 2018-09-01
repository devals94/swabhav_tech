package com.techlabs.builder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.employee.Employee;
import com.techlabs.parser.FileParser;

public class OrganizationBuilder {
	private FileParser parser;
	private List<Employee> employeeList = new ArrayList<Employee>();
	private Map<Integer, Employee> employeeMap = new LinkedHashMap<Integer, Employee>();
	private DisplayOrganizationalHeirarchy display;
	
	public OrganizationBuilder(DisplayOrganizationalHeirarchy display,FileParser parser) throws FileNotFoundException,
			IOException {
		this.parser = parser;
		this.display=display;
		employeeList=build();
		
	}

	public List<Employee> build() throws NumberFormatException, FileNotFoundException, IOException{
		
		for(EmployeeDTO emp : parser.parse()){
			employeeList.add(new Employee(Integer.parseInt(emp.getEmployeeId()), emp.getEmployeeName(), emp.getRole(), emp.getManagerId(), emp.getDate(), Integer.parseInt(emp.getSalary()), emp.getCommision(), emp.getDeptId()));
		}
		
		return employeeList;
	}
	
	public Employee getCEO() throws FileNotFoundException, IOException {
		
		for (Employee employee : employeeList) {
			if (employee.getManagerId().equals("NULL") == true) {
				employeeMap.put(employee.getEmployeeId(), employee);
				addReportees(employee);
				break;
			}
		}
		for (Employee employee : employeeList) {
			if (employee.getManagerId().equals("NULL") != true) {
				employeeMap.put(employee.getEmployeeId(), employee);
				addReportees(employee);
			}
		}
		
		return employeeMap.entrySet().iterator().next().getValue();
	}
	
	private void addReportees(Employee employeeManager){
		for(Employee employee: employeeList){
			if(employee.getManagerId().equals("NULL") == false){
				if(Integer.parseInt(employee.getManagerId())==employeeManager.getEmployeeId()){
					employeeManager.addReportee(employee);
				}
			}
		}
	}

	public void DisplayHeirarchy() throws FileNotFoundException, IOException{
		display.display(this);
	}

	public String parseToXML() throws FileNotFoundException, IOException {
		return display.parseToXML(this);
	}

	public void saveToXML(String fileName) throws FileNotFoundException, IOException{
		display.saveToXML(fileName,this);
		
	}
}