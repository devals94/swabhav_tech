package com.techlabs.lineItem;

public class LineItem implements Comparable<LineItem> {

	private int id;
	private String name;
	private int quantity;
	private float price;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getPrice() {
		return price;
	}

	public LineItem(int id, String name, int quantity, float price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public double calculateCost() {
		return this.quantity * this.price;
	}

	@Override
	public int compareTo(LineItem product) {
		return (int) this.calculateCost() - (int) product.calculateCost();
	}

}
