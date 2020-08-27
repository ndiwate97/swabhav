using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomExceptionApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Model.Account a1 = new Model.Account("Account1", 1500);
            a1.Withdraw(1400);
            try
            {
                printInfo(a1);
            }
            catch (Model.InsufficientFundException e)
            {
                Console.Error.Write(e.Message);
            }

            Model.Account a2 = new Model.Account("Account2", 3500);
            a2.Withdraw(1000);
            try
            {
                printInfo(a2);
            }
            catch (Model.InsufficientFundException e)
            {
                Console.Error.Write(e.Message);
            }          
        }
        private static void printInfo(Model.Account a)
        {
            Console.WriteLine("\nAccount Name : " + a.AccountName);
            try
            {
                if (!a.TransactionStatus)
                {
                    Console.WriteLine("Current Balance : " + a.Balance);
                    throw new Model.InsufficientFundException("You don't have sufficient balance\n");
                }
                else
                    Console.WriteLine("Current Balance : " + a.Balance);
            }
            catch (Model.InsufficientFundException e)
            {
                Console.Error.Write(e.Message);
            }

        }

    }
}
