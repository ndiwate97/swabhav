package com.techlab.guitar;

import java.util.*;

import com.techlab.guitar.enums.*;

public class FindGuitarTest {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, 6, Wood.ALDER,
				Wood.ALDER);

		List matchingGuitars = inventory.search(whatErinLikes);

		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();
				System.out.println("  We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n     " + spec.getBackWood() + " back and sides,\n     " + spec.getTopWood()
						+ " top.\n  You can have it for only $" + guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("1234", 3956,
				new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6, Wood.ADIRONDACK, Wood.CEDAR));

		inventory.addGuitar("V95693", 8429,
				new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ACOUSTIC, 6, Wood.ALDER, Wood.ALDER));

		inventory.addGuitar("V9512", 9549, new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ELECTRIC, 6,
				Wood.BRAZILIAN_ROSEWOOD, Wood.COCOBOLO));

		inventory.addGuitar("122784", 6295,
				new GuitarSpec(Builder.MARTIN, "D-18", Type.ELECTRIC, 6, Wood.INDIAN_ROSEWOOD, Wood.MAPLE));
	}
}
