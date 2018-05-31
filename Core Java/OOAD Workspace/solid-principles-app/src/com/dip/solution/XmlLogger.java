package com.dip.solution;

public class XmlLogger implements ILogger{

	@Override
	public void printLog(Exception ex) {
		System.out.println("Creating an XML...");
		System.out.println(ex.getMessage());
	}

}
