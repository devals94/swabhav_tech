package com.dip.solution;

public class EmailLogger implements ILogger {

	@Override
	public void printLog(Exception ex) {
		System.out.println("Sending an email...");
		System.out.println(ex.getMessage());
	}

}
