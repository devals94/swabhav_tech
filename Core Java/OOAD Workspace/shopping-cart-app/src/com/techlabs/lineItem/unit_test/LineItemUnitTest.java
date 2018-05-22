package com.techlabs.lineItem.unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.lineItem.LineItem;
import com.techlabs.product.Product;

public class LineItemUnitTest {
	
	Product sprite = new Product(100, "Sprite", 12, 2);
	Product mountainDew = new Product(101, "Mountain Dew", 15, 3);
	
	LineItem itemSprite = new LineItem(sprite, 5);
	LineItem itemMountainDew = new LineItem(mountainDew, 10);
	
	@Test
	public void testCalculateLineItemCost() {
		double expectedSpriteItemCost = 50;
		double actualSpriteItemCost = itemSprite.calculateLineItemCost();
		assertEquals(expectedSpriteItemCost, actualSpriteItemCost, 0);
		
		double expectedMountainDewItemCost = 120;
		double actualMountainDewItemCost = itemMountainDew.calculateLineItemCost();
		assertEquals(expectedMountainDewItemCost, actualMountainDewItemCost, 0);
	}

}
