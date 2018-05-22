package com.techlabs.order.unit_test;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import com.techlabs.lineItem.LineItem;
import com.techlabs.order.Order;
import com.techlabs.product.Product;

public class OrderUnitTest {
	Order order;

	@Before
	public void init() {
		order = new Order(1001, new GregorianCalendar(2010, 05, 17).getTime());
	}

	@Test
	public void testOrderListCountBeforeAdding() {
		int expectedListCountBeforeAdding = 0;
		int actualListCountBeforeAdding = order.getCountOfOrderList();
		assertEquals(expectedListCountBeforeAdding, actualListCountBeforeAdding);
	}

	@Test
	public void testOrderListCountAfterAdding() {
		order.add(new LineItem(new Product(100, "Sprite", 12, 2), 5));
		order.add(new LineItem(new Product(101, "Mountain Dew", 15, 3), 10));
		int expectedListCountAfterAdding = 2;
		int actualListCountAfterAdding = order.getCountOfOrderList();
		assertEquals(expectedListCountAfterAdding, actualListCountAfterAdding);
	}

	@Test
	public void testCalculateTotalOrderCost() {
		order.add(new LineItem(new Product(100, "Sprite", 12, 2), 5));
		order.add(new LineItem(new Product(101, "Mountain Dew", 15, 3), 10));
		double expectedOrderCost = 170;
		double actualOrderCost = order.calculateTotalOrderCost();
		System.out.println(actualOrderCost);
		assertEquals(expectedOrderCost, actualOrderCost, 0);
	}
}
