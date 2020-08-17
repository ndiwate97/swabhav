using System;

namespace Custom_Exception_App
{
    class Program
    {
        static void Main(string[] args)
        {
            Account a1 = new Account("Account1", 1500);
            a1.withdraw(1400);
            try
            {
                printInfo(a1);
            }
            catch (InsufficientBalance e)
            {
                Console.Error.Write(e.Message );
            }

            Account a2 = new Account("Account2", 3500);
            a2.withdraw(1000);
            try
            {
                printInfo(a2);
            }
            catch (InsufficientBalance e)
            {
                Console.Error.Write(e.Message);
            }

            Account a3 = new Account("Account3", 4500);
            a3.deposit(1500);
            try
            {
                printInfo(a3);
            }
            catch (InsufficientBalance e)
            {
                Console.Error.Write(e.Message);
            }

            Account a4 = new Account("Account4", 4000);
            a4.deposit(500);
            a4.withdraw(2500);
            printInfo(a4);

        }

        private static void printInfo(Account a)
        {
            Console.WriteLine("\nAccount Name : " + a.getAccountName());
            try
            {
                if (!a.getTransactionStatus())
                {
                    Console.WriteLine("Current Balance : " + a.getBalance());
                    throw new InsufficientBalance("You don't have sufficient balance");
                }
                else
                    Console.WriteLine("Current Balance : " + a.getBalance());
            }
            catch (InsufficientBalance e)
            {
                Console.Error.Write(e.Message);
            }

        }

    }
}
