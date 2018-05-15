package com.techlabs.lineItem;

import java.util.Comparator;

public class QuantityComparator implements Comparator<LineItem>{

	@Override
	public int compare(LineItem value1, LineItem value2) {
		// TODO Auto-generated method stub
		if (value1.getQuantity() < value2.getQuantity())
			return -1;
		if (value1.getQuantity() > value2.getQuantity())
			return 1;
		else
			return 0;
	}
}
