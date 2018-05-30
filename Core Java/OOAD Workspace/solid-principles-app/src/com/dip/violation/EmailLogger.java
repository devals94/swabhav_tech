package com.dip.violation;

public class EmailLogger {
	public void printLog(Exception ex){
		System.out.println("Sending an email...");
		System.out.println("Exception happened because of: "+ex.getMessage());
	}
}
