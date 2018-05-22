package com.techlabs.customer;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.lineItem.LineItem;
import com.techlabs.order.Order;
import com.techlabs.product.Product;

public class Customer {
	private String name;
	private List<Order> orders;
	
	public Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();
	}
	
	public void placeOrder(Order orderInCart){
		orders.add(orderInCart);
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}
}
