package com.techlabs.icrud;

public class InventoryDB implements ICrudable {
	@Override
	public void create() {
		System.out.println("InventoryDB creation");
	}

	@Override
	public void read() {
		System.out.println("InventoryDB read");
		
	}

	@Override
	public void update() {
		System.out.println("InventoryDB updation");
		
	}

	@Override
	public void delete() {
		System.out.println("InventoryDB deletion");
		
	}
}
