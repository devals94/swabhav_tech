package com.dip.solution.test;

import com.dip.solution.EmailLogger;
import com.dip.solution.TaxCalculator;
import com.dip.solution.XmlLogger;

public class TestDipSolution {
	public static void main(String[] args) {
		EmailLogger emailLog = new EmailLogger();
		XmlLogger xmlLog = new XmlLogger();
		
		TaxCalculator ecal = new TaxCalculator(emailLog);
		System.out.println(ecal.calculateTax(10, 5));//gives 2
		System.out.println();
		System.out.println(ecal.calculateTax(10, 0));//sending an email..
		
		System.out.println();
		
		TaxCalculator xcal = new TaxCalculator(xmlLog);
		System.out.println(xcal.calculateTax(20, 5));//gives 4
		System.out.println();
		System.out.println(xcal.calculateTax(20, 0));//creating an xml...
	}
}
