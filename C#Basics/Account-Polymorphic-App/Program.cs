using System;

namespace Account_Polymorphic_App
{
    class Program
    {
        static bool withdrawStatus;
        static void Main(string[] args)
        {
			SavingsAccount a1 = new SavingsAccount(41257, "Account1", 1500);
			printAccountInfo(a1);
			a1.deposit(1000);
			printTransactionInfo(a1);
			a1.withdraw(2000);
			printTransactionInfo(a1);


			CurrentAccount a2 = new CurrentAccount(14789, "Account2", 1500);

			a2.deposit(1000);
			printTransactionInfo(a2);
			a2.withdraw(2000);
			printTransactionInfo(a2);
		}

		private static void printAccountInfo(SavingsAccount a)
		{
			Console.WriteLine("\nAccount No : " + a.getAccNo());
			Console.WriteLine("Account Holder Name : " + a.getAccountName());
			Console.WriteLine("Current Balance : " + a.getBalance());
		}
		private static void printTransactionInfo(Account a)
		{
			if (!a.getTransactionStatus())
			{
				Console.Error.WriteLine("\nYou don't have sufficient balance to Withdraw");
				Console.WriteLine("Current Balance : " + a.getBalance());
			}
			else
				Console.WriteLine("\nTransaction Sucessfull\nCurrent Balance : " + a.getBalance());

		}
	}
}
