package com.techlabs.product.unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.product.Product;

public class ProductUnitTest {

	Product sprite = new Product(100, "Sprite", 12, 2);
	Product mountainDew = new Product(101, "Mountain Dew", 15, 3);

	@Test
	public void testCalculateProductTotalCost() {
		double expectedSpriteCost = 10;
		double actualSpriteCost = sprite.getProductCost()
				- sprite.getDiscount();
		assertEquals(expectedSpriteCost, actualSpriteCost, 0);

		double expectedMountainDewCost = 12;
		double actualMountainDewCost = mountainDew.getProductCost()
				- mountainDew.getDiscount();
		assertEquals(expectedMountainDewCost, actualMountainDewCost, 0);
	}

}
