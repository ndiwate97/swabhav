using System;

namespace Model
{
    class SavingsAccount : Account
    {
		private readonly int MINIMUM_BALANCE = 500;

		public SavingsAccount(int accNo, String accountName, double balance) : base(accNo, accountName, balance)
		{
		}
				
		public override void withdraw(int amount)
		{
			if ((Balance - amount) >= MINIMUM_BALANCE)
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
