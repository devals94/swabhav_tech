package com.techlabs.collections;

import java.util.ArrayList;

import com.techlabs.lineItem.LineItem;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList items = new ArrayList();
		items.add(new LineItem(101, "Laptop", 2, 50000));
		items.add(new LineItem(105, "LCD TV", 1, 150000));
		items.add(new LineItem(110, "Washing Machine", 2, 25000));
		items.add(new LineItem(191, "Oven", 2, 8000));
		items.add(new LineItem(150, "Split AC", 2, 35000));
		printDetails(items);
	}
	
	public static void printDetails(ArrayList cart){
		for(Object item: cart){
			LineItem cartItem = (LineItem)item;
			System.out.println("Total Cost to Pay for: "+cartItem.getName()+" " +cartItem.calculateCost());
		}
	}
}
