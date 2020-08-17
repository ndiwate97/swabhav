using System;
using System.Collections.Generic;
using System.Text;

namespace Custom_Exception_App
{
    class Account
    {
        private String accountName;
        private double balance;
        private static int MINIMUM_BALANCE = 500;
        private bool transactionStatus = true;

        public Account(String accountName, double balance)
        {
            this.accountName = accountName;
            this.balance = balance;
        }

        public void deposit(int amount)
        {//add
            balance = balance + amount;
            transactionStatus = true;
        }

        public void withdraw(int amount)
        {//reduce
            if ((balance - amount) >= 500)
            {
                balance = balance - amount;
                transactionStatus = true;
            }
            else
            {
                transactionStatus = false;
            }
        }


        public int getMinBal()
        {
            return MINIMUM_BALANCE;
        }

        public String getAccountName()
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

    }
}
