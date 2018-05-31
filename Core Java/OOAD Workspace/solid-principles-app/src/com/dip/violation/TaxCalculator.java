package com.dip.violation;

public class TaxCalculator {
	private LogType type;

	public TaxCalculator(LogType type) {
		this.type = type;
	}

	public int calculate(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch (Exception ex) {
			if (type == LogType.XML)
				new XmlLogger().printLog(ex);
			if (type == LogType.EMAIL){
				new EmailLogger().printLog(ex);
				}
		}
		return result;
	}
}
