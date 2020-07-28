using System;
using System.Collections.Generic;
using System.Text;

namespace Account_Static_App
{
	class Account
	{
		private string accountName;
		private double balance;
		private static int MINIMUM_BALANCE;
		private static int totalNumOfTransaction;
		private int individualNumOfTransaction = 0;
		private bool transactionStatus = true;
		private string accountNo;

		static Account()
        {
			MINIMUM_BALANCE = 500;
			totalNumOfTransaction = 0;
		}

		public Account(String accountNo, String accountName, double balance)
		{

			this.accountName = accountName;
			this.balance = balance;
			this.accountNo = accountNo;
		}


		public Account(String accountName, double balance)
		{
			this.accountName = accountName;
			this.balance = balance;
		}


		public void deposit(int amount)
		{
			balance = balance + amount;
			addCount();
			addIndividualCount();
			transactionStatus = true;
		}

		public void withdraw(int amount)
		{
			if ((balance - amount) >= 500)
			{
				balance = balance - amount;
				addCount();
				addIndividualCount();
				transactionStatus = true;
			}
			else
			{
				transactionStatus = false;
			}
		}

		private void addCount()
		{
			totalNumOfTransaction++;
		}
		
		private void addIndividualCount()
		{
			individualNumOfTransaction++;
		}

		public int getMinBal()
		{
			return MINIMUM_BALANCE;
		}

		public static int getCount()
		{
			return totalNumOfTransaction;
		}
		
		public int getIndividualCount()
		{
			return individualNumOfTransaction;
		}

		public string getAccountName()
		{
			return accountName;
		}

		public bool getTransactionStatus()
		{
			return transactionStatus;
		}

		public double getBalance()
		{
			return balance;
		}


		public string getAccountNo()
		{
			return accountNo;
		}

	}
}

