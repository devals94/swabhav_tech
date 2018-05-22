package com.techlabs.product;

public class Product {
	private int productId;
	private String productName;
	private double productCost;
	private float discount;

	public Product(int id, String productName, double productCost,
			float discount) {
		this.productId = id;
		this.productName = productName;
		this.productCost = productCost;
		this.discount = discount;
	}

	public double calculateProductTotalCost() {
		return productCost - discount;
	}

	public int getId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public float getDiscount() {
		return discount;
	}
}
