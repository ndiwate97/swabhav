using System;
using System.Collections.Generic;
using System.Text;

namespace Account_Polymorphic_App
{
    class SavingsAccount : Account
    {

		private readonly int MINIMUM_BALANCE = 500;

		public SavingsAccount(int accNo, String accountName, double balance) : base(accNo, accountName, balance)
		{
			
		}

		
		public override void withdraw(int amount)
		{
			if ((balance - amount) >= MINIMUM_BALANCE)
			{
				balance = balance - amount;
				transactionStatus = true;
			}
			else
			{
				transactionStatus = false;
			}
		}

	}
}
