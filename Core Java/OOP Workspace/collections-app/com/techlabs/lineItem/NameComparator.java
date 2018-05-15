package com.techlabs.lineItem;

import java.util.Comparator;

public class NameComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem product1, LineItem product2) {
		return product1.getName().compareTo(product2.getName());
	}

}
