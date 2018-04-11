package com.techlabs.icrud;

public class CustomerDB implements ICrudable {
	@Override
	public void create() {
		System.out.println("CustomerDB creation");
	}

	@Override
	public void read() {
		System.out.println("CustomerDB read");
		
	}

	@Override
	public void update() {
		System.out.println("CustomerDB updation");
		
	}

	@Override
	public void delete() {
		System.out.println("CustomerDB deletion");
		
	}
}
