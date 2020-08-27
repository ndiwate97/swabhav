using System;

namespace Model

{
	abstract class Account
    {
		private int _accNo;
		private String _accountName;
        protected double balance;
		        
        public Account(int accNo, String accountName, double balance)
		{
			this._accNo = accNo;
			this._accountName = accountName;
			this.balance = balance;
		}

		// getters
		public int AccNo { get => _accNo;  }

		public string AccountName { get => _accountName; }

        public double Balance { get => balance; }

        public void deposit(int amount)
		{
			balance = balance + amount;
			Console.WriteLine("Deposit of "+"amount"+ "is sucessfull...\nCurrent Balance: " + balance);
		}

		public abstract void withdraw(int amount);

	}
}
