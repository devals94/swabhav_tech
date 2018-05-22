package com.techlabs.lineItem;

import com.techlabs.product.Product;

public class LineItem {

	private Product product;
	private int quantity;

	public LineItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double calculateLineItemCost() {
		return product.calculateProductTotalCost() * quantity;
	}
}
