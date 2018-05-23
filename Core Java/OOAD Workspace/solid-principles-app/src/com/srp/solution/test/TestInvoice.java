package com.srp.solution.test;

import com.srp.solution.Invoice;
import com.srp.solution.InvoicePrinter;

public class TestInvoice {
	public static void main(String[] args) {
		Invoice mayekarOptics = new Invoice(0001, "Illusion Optics", 1000, 10.0f);
		Invoice movie = new Invoice(0002, "Jurassic World", 2000, 10.0f);
		InvoicePrinter invoice = new InvoicePrinter();
		invoice.printInvoice(mayekarOptics);
		invoice.printInvoice(movie);
	}


}
