using System;
using System.Collections.Generic;
using System.Text;

namespace Account_Polymorphic_App
{
	abstract class Account
    {
		private int accNo;
		private String accountName;
		protected double balance;
		protected bool transactionStatus = true;

		public Account(int accNo, String accountName, double balance)
		{
			this.accNo = accNo;
			this.accountName = accountName;
			this.balance = balance;
		}

		// getters
		public int getAccNo()
		{
			return accNo;
		}

		public String getAccountName()
		{
			return accountName;
		}

		public double getBalance()
		{
			return balance;
		}

		public bool getTransactionStatus()
		{
			return transactionStatus;
		}

		public void deposit(int amount)
		{
			balance = balance + amount;
		}

		public abstract void withdraw(int amount);

	}
}
