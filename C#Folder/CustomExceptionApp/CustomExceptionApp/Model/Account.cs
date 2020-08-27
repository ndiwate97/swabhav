using System;

namespace CustomExceptionApp.Model
{
    class Account
    {
        private String _accountName;
        private double _balance;
        private static int _MINIMUM_BALANCE = 500;
        private bool _transactionStatus = true;

        public Account(String accountName, double balance)
        {
            this._accountName = accountName;
            this._balance = balance;
        }

        public string AccountName { get => _accountName; }

        public double Balance { get => _balance; }

        public static int MINIMUM_BALANCE { get => _MINIMUM_BALANCE; }

        public bool TransactionStatus { get => _transactionStatus; }

        public void Deposit(int amount)
        {
            _balance = _balance + amount;
            _transactionStatus = true;
        }

        public void Withdraw(int amount)
        {
            if ((_balance - amount) >= 500)
            {
                _balance = _balance - amount;
                _transactionStatus = true;
            }
            else
            {
                _transactionStatus = false;
            }
        }




    }
}

