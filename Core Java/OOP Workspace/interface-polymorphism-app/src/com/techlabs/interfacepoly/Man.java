package com.techlabs.interfacepoly;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("Man Wishing");
		
	}

	@Override
	public void depart() {
		System.out.println("Man Departing");
		
	}
	
}
