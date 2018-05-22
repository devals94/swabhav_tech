package com.techlabs.customer.unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.customer.Customer;
import com.techlabs.order.Order;

public class CustomerUnitTest {

	Customer customer;
	Order order;
	
	@Test
	public void testPlaceOrderMethod(){
		customer = new Customer("Rahul");
		customer.placeOrder(order);
	}

	@Test
	public void testGetOrders(){
		customer.getOrders();
	}
}
