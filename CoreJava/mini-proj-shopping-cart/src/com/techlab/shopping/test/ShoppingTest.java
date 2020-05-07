package com.techlab.shopping.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import com.techlab.shopping.*;

public class ShoppingTest {

	private final static int ADD = 1;
	private final static int MODIFY = 2;
	private final static int SEARCH = 3;
	private final static int DELETE = 4;
	private final static int VIEW = 5;
	private final static int VIEWSTOREITEMS = 6;
	private final static int CHECKOUT = 7;
	private static String customerCart = "C:\\swabhav\\CoreJava\\mini-proj-shopping-cart\\src\\";

	public static void main(String[] args) {
		
		int prodId;
		String prodName;
		int unitPrice;
		int quantity;
		int discount;
		boolean productFound = false;

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		System.out.println("Enter Your Name : ");
		String customerName = sc.next();
		
		System.out.println("Enter Your Address : ");
		String customerAddress = sc.next();
		
		Customer c = new Customer(customerName,new Date(),customerAddress);
		
		customerCart += customerName + ".txt";
		File f = new File(customerCart);
		if (f.exists()) {
			System.out.println("Do you want to retrive your previous cart..?");
			String isCustomerCartRetrive = sc.next();
			if (isCustomerCartRetrive.equalsIgnoreCase("yes")) {
				ArrayList<Product> previousCart = retrivePreviousCart();
				c.setCartList(previousCart);
				
			}
		}
		

		System.out.println(Store.availableProduct);

		while (choice != CHECKOUT) {
			System.out.println(
					"\n1. Add to Items to cart\n2. Modify Cart Items\n3. Search Item\n4. Delete Item\n5. Display Cart\n6. view Store Items.\n7. Checkout");
			System.out.println("Enter Your Choice : ");

			choice = sc.nextInt();

			switch (choice) {
			case ADD:
				System.out.println("Enter the ID of product that you want to add: ");
				prodId = sc.nextInt();
				for (Product p : Store.availableProduct) {
					if (p.getProdId() == prodId) {
						System.out.println("How much " + p.getProdName() + "(s) do you want?");
						quantity = sc.nextInt();
						prodName = p.getProdName();
						unitPrice = p.getUnitPrice();
						discount = p.getDiscountPercentage();
						c.addIntoCart(prodId, prodName, unitPrice, quantity, discount);
						productFound = true;
					}
				}
				if (!productFound) {
					System.out.println("Sorry we dont have that product...!");
				}
				break;

			case MODIFY:
				System.out.println("Enter the ID of product that you want to modify : ");
				prodId = sc.nextInt();
				for (Product p : Store.availableProduct) {
					if (p.getProdId() == prodId) {
						System.out.println("How much " + p.getProdName() + "(s) do you want now ?");
						quantity = sc.nextInt();
						productFound = true;
						c.modifyCartItem(prodId, quantity);
					}
				}
				if (!productFound) {
					System.out.println("We dont have that product...!\nCheck Product ID again...");
				}
				break;

			case SEARCH:
				System.out.println("Enter the ID of product that you want to search in your cart :");
				prodId = sc.nextInt();
				c.SearchFromCart(prodId);
				break;

			case DELETE:
				System.out.println("Enter the ID of product that you want to remove from your cart : ");
				prodId = sc.nextInt();
				c.DeletefromCart(prodId);
				break;

			case VIEW:
				displayContactList(Customer.getList());
				break;

			case VIEWSTOREITEMS:
				System.out.println(Store.availableProduct);
				break;
			case CHECKOUT:
				c.checkoutCart();
				System.out.println("Do you want to save your Cart for future..?");
				 String isSaveCart = sc.next();
					if (isSaveCart.equalsIgnoreCase("yes")) {
						saveCustomerCart();
					}
				System.out.println("Checkout Successful...!");
				sc.close();
				break;

			default:
				System.err.println("Invalid Choice....!");
				break;
			}
		}

	}

	private static ArrayList<Product> retrivePreviousCart() {
		ArrayList<Product> list = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(customerCart));

			list = (ArrayList<Product>) in.readObject();
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	
	private static void saveCustomerCart() {
		try {
			FileOutputStream fout = new FileOutputStream(customerCart);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(Customer.getList());
			out.flush();
			out.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	
	private static void displayContactList(List<Product> list) {
		System.out.println(list);
	}

}