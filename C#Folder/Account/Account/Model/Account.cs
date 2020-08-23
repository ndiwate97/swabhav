using System;

namespace Account.Model
{
    class Account
    {
		private string _accountNo;
		private string _accountName;
		private double _balance;
		private static int _noOfAccuntHolder = 0;
		private static int _totalNumOfTransaction;
		private int _individualNumOfTransaction = 0;
		private bool _transactionStatus = true;

        public Account(String accountNo, String accountName, double balance)
		{
			_noOfAccuntHolder++;
			this._accountName = accountName;
			this._balance = balance;
			this._accountNo = accountNo;
		}


		public Account(String accountName, double balance)
		{
			_noOfAccuntHolder++;
			this._accountName = accountName;
			this._balance = balance;
		}

		public void Deposit(int amount)
		{
			_balance = _balance + amount;
			AddCount();
			AddIndividualCount();
			_transactionStatus = true;
		}

		public void Withdraw(int amount)
		{
			if ((_balance - amount) >= 500)
			{
				_balance = _balance - amount;
				AddCount();
				AddIndividualCount();
				_transactionStatus = true;
			}
			else
			{
				_transactionStatus = false;
			}
        }

		private void AddCount()
		{
			_totalNumOfTransaction++;
		}

		private void AddIndividualCount()
		{
			_individualNumOfTransaction++;
		}


		public string AccountNo { get => _accountNo; }

		public string AccountName { get => _accountName; }

		public double Balance { get => _balance; }

		public static int TotalAccountHolders { get => _noOfAccuntHolder; }

		public static int TotalNoOfTransaction { get => _totalNumOfTransaction; }

		public int NoOfIndividualTransaction { get => _individualNumOfTransaction; }

        public bool TransactionStatus { get => _transactionStatus;}
    }
}
