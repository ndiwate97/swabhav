package com.techlab.cart.test;

import java.util.ArrayList;

import com.techlab.lineitem.LineItem;

public class CartTest {

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();

		cart.add(new LineItem(101, "Apple", 30, 10));
		cart.add(new LineItem(105, "Banana", 15, 5));
		cart.add(new LineItem(199, "ToothPaste", 85, 2));
//		cart.add("Hello World"); //error

		printCartItems(cart);

	}

	private static void printCartItems(ArrayList<LineItem> cart) {
		double grandTotal = 0;
		for (LineItem li : cart) {
			System.out.println("\nName of Item : " + li.getName());
			System.out.println("Price : " + li.getUnitPrice());
			System.out.println("Quantity : " + li.getQuantity());
			System.out.println("Total cost of item : " + li.calculateTotal());
			grandTotal += li.calculateTotal();
		}
		System.out.println("\nGrand Total of Cart : " + grandTotal);
	}

}
