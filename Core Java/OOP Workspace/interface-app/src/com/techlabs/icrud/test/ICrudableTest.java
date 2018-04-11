package com.techlabs.icrud.test;

import com.techlabs.icrud.CustomerDB;
import com.techlabs.icrud.ICrudable;
import com.techlabs.icrud.InvoiceDB;
import com.techlabs.icrud.InventoryDB;

public class ICrudableTest {
	public static void main(String[] args) {
		doDBOperations(new CustomerDB());
		doDBOperations(new InvoiceDB());
		doDBOperations(new InventoryDB());
	}
	
	public static void doDBOperations(ICrudable obj){
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
		System.out.println();
	}
}
