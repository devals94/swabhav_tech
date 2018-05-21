package com.techlabs.test;

import java.util.Iterator;
import java.util.List;

import com.techlabs.enums.Builder;
import com.techlabs.enums.Type;
import com.techlabs.enums.Wood;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.inventory.Inventory;

public class FindGuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatCustomerLikes = new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

		List matchingGuitars = inventory.search(whatCustomerLikes);

		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("  We have a " + spec.getBuilder() + " "
						+ spec.getModel() + " " + spec.getType()
						+ " guitar:\n     " + spec.getBackWood()
						+ " back and sides,\n     " + spec.getTopWood()
						+ " top.\n  You can have it for only $"
						+ guitar.getPrice()
						+ "!\n  ------------------------------------");
			}
		} else {
			System.out.println("Sorry, Customer, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// inventory.addGuitar("V95693", 1499.95, Builder.FENDER,
		// "Stratocastor",
		// Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		// inventory.addGuitar("V95123", 1549.95, Builder.FENDER,
		// "Stratocastor",
		// Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

		inventory.addGuitar("11277", 3999.95, new GuitarSpec(Builder.COLLINGS,
				"CJ", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.FENDER,
				"Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("122784", 5495.95, new GuitarSpec(Builder.MARTIN,
				"D-18", Type.ACOUSTIC, 6, Wood.MAHOGANY, Wood.ADIRONDACK));
		inventory.addGuitar("76531", 6295.95, new GuitarSpec(Builder.MARTIN,
				"OM-28", Type.ACOUSTIC, 6, Wood.BRAZILIAN_ROSEWOOD,
				Wood.ADIRONDACK));
		inventory.addGuitar("70108276", 2295.95, new GuitarSpec(Builder.GIBSON,
				"Les Paul", Type.ELECTRIC, 6, Wood.MAHOGANY, Wood.MAHOGANY));

	}
}
