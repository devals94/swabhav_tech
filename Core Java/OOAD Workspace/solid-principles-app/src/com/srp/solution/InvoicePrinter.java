package com.srp.solution;

public class InvoicePrinter {

	public void printInvoice(Invoice in) {
		System.out.printf("Total Cost of " + in.getName() + " is %.2f \n" , in.calculateTotalCost());
	}

}
