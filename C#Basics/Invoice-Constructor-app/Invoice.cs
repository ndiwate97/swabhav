using System;
using System.Collections.Generic;
using System.Text;

namespace Invoice_Constructor_app
{
    class Invoice
    {
		private int id;
		private string name;
		private double amount;
		private double discountPercentage;
		private readonly float GST = 5f;
		private double discountedAmount;

		//parameterized constructor
		public Invoice(int id, String name, double amount, double discountPercentage)
		{
			this.id = id;
			this.name = name;
			this.amount = amount;
			this.discountPercentage = discountPercentage;
		}

		//default constructor
		public Invoice()
		{
			id = 0;
			name = "notDefined";
			amount = 0.0;
			discountedAmount = 0;
		}

		public int getID()
		{
			return id;
		}

		public String getName()
		{
			return name;
		}

		public double getAmount()
		{
			return amount;
		}

		public double getDiscountPrecentage()
		{
			return discountPercentage;
		}

		public double calculateDiscount(double amount, double discountPercentage)
		{
			discountedAmount = (amount - (discountPercentage / 100 * amount));
			return (discountedAmount);
		}


		public float calculateGST()
		{
			return (float)(GST / 100 * discountedAmount);
		}

		public double calculateTotalCost(double Gst)
		{
			return (this.calculateDiscount(amount, discountPercentage) + Gst);
		}

	}
}