package com.dip.solution;

public class TaxCalculator {
	private ILogger log;

	public TaxCalculator(ILogger log) {
		this.log = log;
	}

	public int calculateTax(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (Exception ex) {
			log.printLog(ex);
		}
		return result;
	}
}
