package com.srp.violation.test;

import com.srp.violation.Invoice;

public class TestInvoice {
	public static void main(String[] args) {
		Invoice mayekarOptics = new Invoice(0001, "Illusion Optics", 1000, 10.0f);
		Invoice movie = new Invoice(0002, "Jurassic World", 2000, 10.0f);
		mayekarOptics.printInvoice();
		movie.printInvoice();
	}


}
