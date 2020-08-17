using System;

namespace Account_Static_App
{
    class Program
    {
        static void Main(string[] args)
        {
			Account a1 = new Account("Account1", 1500);
			//		Console.WriteLine(a1.getMinBal());
			a1.withdraw(1400);
			printInfo(a1);

			Account a2 = new Account("Account2", 3500);
			a2.withdraw(1000);
			printInfo(a2);

			Account a3 = new Account("Account3", 4500);
			a3.deposit(1500);
			printInfo(a3);

			Account a4 = new Account("Account4", 4000);
			a4.deposit(500);
			a4.withdraw(2500);
			printInfo(a4);

			Console.WriteLine("Total no of Transaction in system:" + Account.getCount());

		}

		private static void printInfo(Account a)
		{
			//		case 2: totalNumOfTransaction by each object
			Console.WriteLine("\nTotal no of Transaction done by " + a.getAccountName() + " : " + a.getIndividualCount());
			if (!a.getTransactionStatus())
			{
				Console.WriteLine("You don't have sufficient balance");
				Console.WriteLine("Current Balance : " + a.getBalance());
			}
			else
				Console.WriteLine("Current Balance : " + a.getBalance());

		}

	}
}
