using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AccountEventApp.Publisher
{
    //public delegate void DBalanceChanged(Account acc);

    public class Account
    {
        private string _accountNo;
        private string _accountName;
        private double _balance;

        //public event DBalanceChanged OnBalanceChanged = null;

        public event Action<Account> OnBalanceChanged = null;

        public Account(String accountNo, String accountName, double balance)
        {
            this._accountName = accountName;
            this._balance = balance;
            this._accountNo = accountNo;
        }

        public void Deposit(int amount)
        {
            _balance = _balance + amount;
            if (OnBalanceChanged != null)
            {
                OnBalanceChanged(this);
            }
        }

        public void Withdraw(int amount)
        {
            if ((_balance - amount) >= 500)
            {
                _balance = _balance - amount;
                if (OnBalanceChanged != null)
                {
                    OnBalanceChanged(this);
                }
            }
            else
            {
                Console.WriteLine("Insufficient Balance...!");
            }
        }

        public string AccountNo { get => _accountNo; }

        public string AccountName { get => _accountName; }

        public double Balance { get => _balance; }
    }
}
