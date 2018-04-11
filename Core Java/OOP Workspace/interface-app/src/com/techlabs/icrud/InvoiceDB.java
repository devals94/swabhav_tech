package com.techlabs.icrud;

public class InvoiceDB implements ICrudable {
	@Override
	public void create() {
		System.out.println("InvoiceDB creation");
	}

	@Override
	public void read() {
		System.out.println("InvoiceDB read");
		
	}

	@Override
	public void update() {
		System.out.println("InvoiceDB updation");
		
	}

	@Override
	public void delete() {
		System.out.println("InvoiceDB deletion");
		
	}
}
