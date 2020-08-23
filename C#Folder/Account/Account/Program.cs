using System;

namespace Account
{
    class Program
    {
        static void Main(string[] args)
        {
			Model.Account a1 = new Model.Account("Account1", 1500);
			a1.Withdraw(1400);
			PrintInfo(a1);

			Model.Account a2 = new Model.Account("Account2", 3500);
			a2.Withdraw(1000);
			PrintInfo(a2);

			Model.Account a3 = new Model.Account("Account3", 4500);
			a3.Deposit(1500);
			PrintInfo(a3);

			Model.Account a4 = new Model.Account("Account4", 4000);
			a4.Deposit(500);
			a4.Withdraw(2500);
			PrintInfo(a4);

			Console.WriteLine("\nTotal no of account holders : "+ Model.Account.TotalAccountHolders);
			Console.WriteLine("\nTotal no of Transaction in system: " + Model.Account.TotalNoOfTransaction);
		}

		private static void PrintInfo(Model.Account a)
		{
			Console.WriteLine("\nTotal no of Transaction done by " + a.AccountName + " : " + a.NoOfIndividualTransaction);
			if (!a.TransactionStatus)
			{
				Console.WriteLine("You don't have sufficient balance");
				Console.WriteLine("Current Balance : " + a.Balance);
			}
			else
				Console.WriteLine("Current Balance : " + a.Balance);
		}
	}
}
