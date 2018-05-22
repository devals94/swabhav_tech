package com.techlabs.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.techlabs.lineItem.LineItem;
import com.techlabs.product.Product;

public class Order {
	private int orderId;
	private Date orderDate;
	private List<LineItem> items;

	public Order(int orderId, Date orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		items = new ArrayList<LineItem>();
	}

	public List<LineItem> getItems() {
		return items;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void add(LineItem addLineItem) {
		for (LineItem item : items) {
			if (item.getProduct().getId() == addLineItem.getProduct().getId()) {
				int quantity = addLineItem.getQuantity() + item.getQuantity();
				item.setQuantity(quantity);
				return;
			}
		}
		items.add(addLineItem);
	}

	public double calculateTotalOrderCost() {
		double totalCost = 0;
		for (LineItem listItems : items) {
			totalCost += listItems.calculateLineItemCost();
		}
		return totalCost;
	}

	public int getCountOfOrderList() {
		return items.size();
	}
}
