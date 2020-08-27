using Model;
using System;

namespace AccountPolymorphismApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Model.Account a1 = new Model.SavingsAccount(41257, "Account1", 1500);
            printAccountInfo(a1);
            a1.deposit(1000);
            a1.withdraw(2000);

            Model.Account a2 = new Model.CurrentAccount(14789, "Account2", 1500);
            printAccountInfo(a2);
            a2.deposit(1000);
            a2.withdraw(5000);

        }

        private static void printAccountInfo(Model.Account a)
        {
            Console.WriteLine("\nAccount No : " + a.AccNo);
            Console.WriteLine("Account Holder Name : " + a.AccountName);
            Console.WriteLine("Current Balance : " + a.Balance);
        }


    }
}

