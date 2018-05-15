package com.techlabs.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.techlabs.lineItem.LineItem;
import com.techlabs.lineItem.NameComparator;
import com.techlabs.lineItem.QuantityComparator;

public class GenericTestCollection {

	public static void main(String[] args) {
		List<LineItem> kartItems = new ArrayList<LineItem>();
		kartItems.add(new LineItem(101, "Laptop", 3, 50_000));
		kartItems.add(new LineItem(105, "LCD TV", 2, 150_000));
		kartItems.add(new LineItem(110, "Washing Machine", 5, 25_000));
		kartItems.add(new LineItem(191, "Oven", 3, 8_000));
		kartItems.add(new LineItem(150, "Split AC", 5, 35_000));
		
		System.out.println("Natural Order");
		printDetailsByTotalCost(kartItems);
		System.out.println();
		Collections.sort(kartItems);
		
		System.out.println("Sorted By Final Cost");
		printDetailsByTotalCost(kartItems);

		System.out.println("\nSorted by Name");
		NameComparator nameCompare = new NameComparator();
		Collections.sort(kartItems, nameCompare);
		printDetailsByName(kartItems);
		System.out.println();
		
		System.out.println("\nSorted by Quantity");
		QuantityComparator quantityCompare = new QuantityComparator();
		Collections.sort(kartItems, quantityCompare);
		printDetailsByQuantity(kartItems);
		
		
	}

	public static void printDetailsByTotalCost(List<LineItem> items) {
		for (LineItem product : items) {
			System.out.println("Total Cost of " + product.getName() + " is "
					+ product.calculateCost());
		}
	}
	
	public static void printDetailsByName(List<LineItem> items) {
		for (LineItem product : items) {
			System.out.println("Total Cost of " + product.getName() + " is "
					+ product.calculateCost());
		}
	}
	
	public static void printDetailsByQuantity(List<LineItem> items) {
		for (LineItem product : items) {
			System.out.println("Total Cost of "+ product.getQuantity() + " " + product.getName() + " is "
					+ product.calculateCost());
		}
	}

}
