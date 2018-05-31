package com.dip.violation.test;

import com.dip.violation.LogType;
import com.dip.violation.TaxCalculator;

public class TestDipViolation {
	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(LogType.EMAIL);
		System.out.println(calc.calculate(10, 2));//working perfectly fine
		System.out.println();
		System.out.println(calc.calculate(10, 0));//working with exception
	}
}
