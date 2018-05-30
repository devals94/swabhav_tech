package com.dip.violation;

public class XmlLogger {
	public void printLog(Exception ex){
		System.out.println("Creating an XML...");
		System.out.println("Exception happened because of: "+ex.getMessage());
	}
}
