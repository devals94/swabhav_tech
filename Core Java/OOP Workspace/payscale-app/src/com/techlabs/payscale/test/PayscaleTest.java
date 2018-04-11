package com.techlabs.payscale.test;

import com.techlabs.payscale.Accountant;
import com.techlabs.payscale.Developer;
import com.techlabs.payscale.Employee;
import com.techlabs.payscale.Manager;

public class PayscaleTest {
	public static void main(String[] args) {
		Manager man = new Manager(12540,"Patrick",15000);
		printPayscale(man);
		Developer dev = new Developer(34150,"Lois",20000);
		printPayscale(dev);
		Accountant acc = new Accountant(56987,"Lawrence",10000);
		printPayscale(acc);
		
	}
	
	public static void printPayscale(Employee emp){
		System.out.println(emp.getClass().getSimpleName() +" Name: " + emp.getEmpname());
		System.out.println(emp.getClass().getSimpleName() +" Number: " + emp.getEmpno());
		System.out.println(emp.getClass().getSimpleName() + " TotalSalary: " + emp.totalSalary());
		System.out.println();
	} 
}
