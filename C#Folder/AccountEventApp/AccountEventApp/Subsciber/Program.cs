using System;
using AccountEventApp.Publisher;

namespace AccountEventApp.Subsciber
{
    class Program
    {
        static void Main(string[] args)
        {
            Account acc = new Account("ACC101", "Namrata", 5000);

            acc.OnBalanceChanged += SendSms;
            acc.OnBalanceChanged += SendEmail;
            acc.OnBalanceChanged += SendWhatsAppMsg;

            acc.Deposit(1000);
            acc.Withdraw(500);
        }

        private static void SendSms(Account acc)
        {
            Console.WriteLine("\nSMS send to \"" + acc.AccountName + "\"");
            Console.WriteLine("Current Balance is Rs." + acc.Balance);    
        }

        private static void SendEmail(Account acc)
        {
            Console.WriteLine("Email send to \"" + acc.AccountName + "\"");
            Console.WriteLine("Current Balance is Rs." + acc.Balance);
        }

        private static void SendWhatsAppMsg(Account acc)
        {
            Console.WriteLine("WhatsAppMsg send to \"" + acc.AccountName + "\"");
            Console.WriteLine("Current Balance is Rs." + acc.Balance);
        }
    }
}
