package com.techlab.shopping;

import java.util.*;

import com.techlab.shopping.test.Store;

public class Customer {

	private static int custId =101;
	private String custName;
	private Date purchaseDate;
	private String address;
	boolean productFound = false;
	boolean quantityAvailable;
	private float grandTotal = 0;

	public Customer( String custName, Date purchaseDate, String address) {
		this.custName = custName;
		this.purchaseDate = purchaseDate;
		this.address = address;
		custId++;
	}
	
	
	private static List<Product> cartList = new ArrayList<Product>();

	public static List<Product> getList() {
		return cartList;
	}

	public static void setCartList(List<Product> cartList) {
		Customer.cartList = cartList;
	}
	private boolean checkQuantity(int prodId, int quantity) {
		for (Product storeProduct : Store.availableProduct) {
			if (prodId == storeProduct.getProdId() && quantity <= storeProduct.getQuantity())
				return true;
		}
		return false;
	}

	public void addIntoCart(int prodId, String prodName, int unitPrice, int quantity, int discount) {

		quantityAvailable = checkQuantity(prodId, quantity);
		if (quantityAvailable) {
			Product p = new Product(prodId, prodName, unitPrice, discount, quantity);
			cartList.add(p);
		} else
			System.err.println("No of " + prodName + "(s) you want is not available...!");
	}

	public void SearchFromCart(int prodId) {
		productFound = false;
		for (Product p : cartList) {
			if (prodId == p.getProdId()) {
				productFound = true;
				System.out.println("\nProduct ID = " + p.getProdId() + ", Product Name = " + p.getProdName()
						+ ", Unit Price =" + p.getUnitPrice() + ", Quantity = " + p.getQuantity()
						+ ", Discount Given = " + p.getDiscountPercentage() + "%");
			}
		}
		if (!productFound) {
			System.err.println("You don't have that item added in your cart...! ");
		}
	}

	public void DeletefromCart(int prodId) {
		int i = 0;
		int index = cartList.size() + 1;
		for (Product p : cartList) {
			if (prodId == p.getProdId()) {
				index = i;
			}
			i++;
		}
		if (index < cartList.size())
			cartList.remove(index);
		else
			System.err.println("You don't have that item added in your cart...!");

	}

	public void modifyCartItem(int prodId, int quantity) {
		quantityAvailable = checkQuantity(prodId, quantity);

		productFound = false;

		if (quantityAvailable) {
			for (Product p : cartList) {
				if (prodId == p.getProdId()) {
					p.setQuantity(quantity);
					productFound = true;
				}
			}
			if (!productFound) {
				System.err.println("You don't have that item added in your cart...! ");
			}
		} else
			System.err.println("Not enough product we have...!");
	}

	public void checkoutCart() {
		System.out.println("\nCustomer Id : "+custId);
		System.out.println("Name : "+ custName);
		System.out.println("Address : "+address);
		System.out.println("Purchase Date : "+purchaseDate);
		for (Product cartProduct : cartList) {
			for (Product storeProduct : Store.availableProduct) {
				if (cartProduct.getProdId() == storeProduct.getProdId()) {
					int quantity = storeProduct.getQuantity() - cartProduct.getQuantity();
					Store.modifyStoreProduct(cartProduct.getProdId(), quantity);
				}
			}
			System.out.println(cartProduct.getProdName()+" = rs."+cartProduct.getTotal());
			grandTotal += cartProduct.getTotal();
		}
		
		System.out.println("Your Total Bill is : Rs."+grandTotal);
	}
	
	
}
