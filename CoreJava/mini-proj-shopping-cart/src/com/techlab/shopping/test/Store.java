package com.techlab.shopping.test;

import java.io.*;
import java.util.*;

import com.techlab.shopping.Product;

public class Store {

	private final static int ADD = 1;
	private final static int MODIFY = 2;
	private final static int SEARCH = 3;
	private final static int DELETE = 4;
	private final static int VIEW = 5;
	private final static int CHECKOUT = 6;
	public static ArrayList<Product> availableProduct = new ArrayList<Product>();
	private final static String FILEPATH = "C:\\swabhav\\CoreJava\\mini-proj-shopping-cart\\src\\AvailableProductList.txt";

	static int prodId;
	static String prodName;
	static int unitPrice;
	static int quantity;
	static int discountPercent;
	static boolean productFound;
	
	static {
		availableProduct = retriveAvailableProduct();
	}
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (choice != 6) {
			System.out.println(
					"\n1. Add to Items in Store\n2. Modify Store Items\n3. Search Item\n4. Delete Item\n5. Display available Store items\n6. Exit");
			System.out.println("Enter Your Choice : ");

			choice = sc.nextInt();

			switch (choice) {
			case ADD:
				System.out.println("Enter product id : ");
				prodId = sc.nextInt();
				System.out.println("Enter Product Name : ");
				prodName = sc.next();
				System.out.println("Enter Unit Price : ");
				unitPrice = sc.nextInt();
				System.out.println("Enter Quantity : ");
				quantity = sc.nextInt();
				System.out.println("Enter the discount % : ");
				discountPercent = sc.nextInt();
				availableProduct.add(new Product(prodId, prodName, unitPrice, discountPercent, quantity));
				saveAvailableList();
				break;

			case MODIFY:
				productFound = false;
				System.out.println("Enter the ID of product that you want to modify : ");
				prodId = sc.nextInt();
				System.out.println("Give the updated Quantity :");
				quantity = sc.nextInt();
				modifyStoreProduct(prodId, quantity);
				
				break;

			case SEARCH:
				System.out.println("Enter the ID of product that you want to search in the Store :");
				prodId = sc.nextInt();
				productFound = false;
				for (Product p : availableProduct) {
					if (prodId == p.getProdId()) {
						productFound = true;
						System.out.println("\nProduct ID = " + p.getProdId() + ", Product Name = " + p.getProdName()
								+ ", Unit Price =" + p.getUnitPrice() + ", Quantity = " + p.getQuantity()
								+ ", Discount Given = " + p.getDiscountPercentage() + "%");
					}
				}
				if (!productFound) {
					System.err.println("No such item found at the Store...! ");
				}
				break;


			case DELETE:
				System.out.println("Enter the ID of product that you want to remove from the Store : ");
				prodId = sc.nextInt();
				int i = 0;
				int index = availableProduct.size() + 1;
				for (Product p : availableProduct) {
					if (prodId == p.getProdId()) {
						index = i;
					}
					i++;
				}
				if (index < availableProduct.size())
					availableProduct.remove(index);
				else
					System.err.println("No such item found at the Store...!");
				saveAvailableList();
				break;

			case VIEW:
				displayStoreItems();
				break;

			case CHECKOUT:
				System.out.println("Exit Successfully...!");
				sc.close();
				break;

			default:
				System.err.println("Invalid Choice....!");
				break;
			}
		}

	}

	public static void modifyStoreProduct(int prodId, int quantity) {
		for (Product p : Store.availableProduct) {
			if (p.getProdId() == prodId) {
				productFound = true;
				p.setQuantity(quantity);
			}
		}
		if (!productFound) {
			System.err.println("No such item found at the Store...!");
		}
		saveAvailableList();
	}

	private static void displayStoreItems() {
		System.out.println(availableProduct);
	}

	private static void saveAvailableList() {
		try {
			FileOutputStream fout = new FileOutputStream(FILEPATH);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(availableProduct);
			out.flush();
			out.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static ArrayList<Product> retriveAvailableProduct() {
		ArrayList<Product> list = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILEPATH));

			list = (ArrayList<Product>) in.readObject();
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
