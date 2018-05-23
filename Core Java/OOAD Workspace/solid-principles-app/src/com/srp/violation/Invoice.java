package com.srp.violation;

public class Invoice {
	private int invoiceNo;
	private String name;
	private double cost;
	private float discountPercent;
	private final static float GST = 0.18f;

	public Invoice(int invoiceNo, String name, double cost,
			float discountPercent) {
		this.invoiceNo = invoiceNo;
		this.name = name;
		this.cost = cost;
		this.discountPercent = discountPercent;
	}
	
	private double calculateDiscount(){
		double discount = (discountPercent/100) * cost;
		return discount;
	}
	
	private double calculateTax(){
		double costAfterDiscount = cost - calculateDiscount();
		double taxableAmount = GST * costAfterDiscount;
		return taxableAmount;
	}
	
	public double calculateTotalCost(){
		double totalCost  = cost - calculateDiscount() + calculateTax();
		return totalCost;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscountPercent() {
		return discountPercent;
	}
	
	public void printInvoice() {
		System.out.printf("Total Cost of " + this.name + " is %.2f \n" , this.calculateTotalCost());
	}

}
