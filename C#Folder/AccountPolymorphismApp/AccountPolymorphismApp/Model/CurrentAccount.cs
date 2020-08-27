using System;

namespace Model
{
	class CurrentAccount : Account
	{

		private int  overDraft = 2500;

		public CurrentAccount(int accNo, String accountName, double balance) : base(accNo, accountName, balance)
		{
		}

		public override void withdraw(int amount)
		{
			if ((Balance - amount) >= -overDraft)
			{
				balance = balance - amount;
				Console.WriteLine("Transaction Sucessfull\nCurrent Balance : " + Balance);
			}
			else
			{
				Console.Error.WriteLine("You don't have sufficient balance to Withdraw");
				Console.WriteLine("Current Balance : " + Balance);
			}
		}
	}
}