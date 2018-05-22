package com.techlabs.orderHistory;

import java.util.GregorianCalendar;
import java.util.List;

import com.techlabs.customer.Customer;
import com.techlabs.lineItem.LineItem;
import com.techlabs.order.Order;
import com.techlabs.product.Product;

public class OrderHistory {
	public static void printOrderDetails(Customer customer) {
			System.out.println(customer.getName());
			List<Order> temp = customer.getOrders();
			for(Order or: temp){
				List<LineItem> li =  or.getItems();
				for(LineItem pr: li){
					System.out.println(pr.calculateLineItemCost());
			}
		}
	}

	public static void main(String[] args) {
		
		Product samsungSmartPhone = new Product(5001,
				"Samsung J7 Max Smartphone", 23000, 3000);
		Product dellLaptop = new Product(10201,
				"Inspiron 15 Dell Laptop 3000 Series", 49500, 2500);
		Product panasonicAC = new Product(4501,
				"Panasonic 4 Star 1.5 Ton Split AC", 37250, 2250);
		Product sonyTV = new Product(1254,
				"Sony Bravia 40 inch Full Led SmartTV", 43999, 2999);

		
		LineItem itemSamsungSmartPhone = new LineItem(samsungSmartPhone, 10);
		LineItem itemDellLaptop = new LineItem(dellLaptop, 7);
		LineItem itemPanasonicAC = new LineItem(panasonicAC, 5);
		LineItem itemSonyTV = new LineItem(sonyTV, 3);
		LineItem itemSony = new LineItem(new Product(1254,
				"Sony Bravia 40 inch Full Led SmartTV", 43999, 2999), 5);

		
		Order janOrder = new Order(10012,
				new GregorianCalendar(2015, 01, 10).getTime());
		janOrder.add(itemSonyTV);
		janOrder.add(itemSony);

		Order febOrder = new Order(10040,
				new GregorianCalendar(2015, 02, 15).getTime());
		febOrder.add(new LineItem(new Product(4501,
				"Panasonic 4 Star 1.5 Ton Split AC", 37250, 2250), 5));
		febOrder.add(itemPanasonicAC);

		Order marOrder = new Order(10122,
				new GregorianCalendar(2015, 03, 9).getTime());
		marOrder.add(new LineItem(new Product(1254,
				"Sony Bravia 40 inch Full Led SmartTV", 43999, 2999), 2));
		marOrder.add(new LineItem(new Product(1254,
				"Sony Bravia 40 inch Full Led SmartTV", 43999, 2999), 4));
		marOrder.add(itemSamsungSmartPhone);
		

		Order aprOrder = new Order(10137,
				new GregorianCalendar(2015, 04, 5).getTime());
		aprOrder.add(itemDellLaptop);
		aprOrder.add(itemDellLaptop);
		
		Customer premiumCustomer = new Customer("Seth Meyers");
		premiumCustomer.placeOrder(janOrder);
		//premiumCustomer.placeOrder(febOrder);
		displayOrderDetails(premiumCustomer);
	

		Customer exclusiveCustomer = new Customer("George Dudley");
		exclusiveCustomer.placeOrder(marOrder);
		//exclusiveCustomer.placeOrder(aprOrder);
		displayOrderDetails(exclusiveCustomer);
	}
	
	public static void displayOrderDetails(Customer cust){
		List<Order> orderList = cust.getOrders();
		List<LineItem> lineItemList;
		Product productList;
		for(Order cartOrder: orderList){
			lineItemList = cartOrder.getItems();
			for(LineItem cartList: lineItemList){
				productList = cartList.getProduct();
				System.out.println("Customer Name: "+cust.getName());
				System.out.println("\nOrder Month:"+cartOrder.getOrderDate().getMonth());
				System.out.print("Product Name: " + productList.getProductName() + "\nProductCost:  " + productList.getProductCost() + "\tProductQuantity: " + cartList.getQuantity() + "\nTotalProductCost: " + cartList.calculateLineItemCost() + "\n" + "\n");
				
			}
			System.out.println("\nTotalOrderCost: "+cartOrder.calculateTotalOrderCost() + "\tOrderCount: "+ cartOrder.getCountOfOrderList() + "\n");	
		}
		System.out.println();
	}
}
