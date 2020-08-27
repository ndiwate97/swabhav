using System;
using System.Net;

namespace DelegatApp
{
    // Declaring the delegates 
    public delegate void DSayAnything(string name);

    class Program
    {
        static void Main(string[] args)
        {
            Case1();
            Case2();
            Case3();
            Case4();
            Case5();
        }

        public static void SayHello(string name)
        {
            Console.WriteLine("{0} says hello....", name);
        }

        public static void SayGoodBye(string name)
        {
            Console.WriteLine("{0} says good bye....", name);
        }

        public static void Case1()
        {
            Console.WriteLine("\nCase 1:\n");
            DSayAnything x;
            x = SayHello;
            x("Namrata");
            x = SayGoodBye;
            x("Pawan");
        }

        public static void Case2()
        {
            Console.WriteLine("\nCase 2:\n");
            DSayAnything y;
            y = SayHello;
            y += SayGoodBye;
            y("Tejashree");
        }

        public static void MessageWizard(DSayAnything fn)
        {
            Console.WriteLine("Inside Message Wizard");
            fn("champ");
        }

        public static void Case3()
        {
            Console.WriteLine("\nCase 3:\n");
            MessageWizard(SayHello);
            MessageWizard(SayGoodBye);
        }
        
        public static void Case4()
        {
            Console.WriteLine("\nCase 4:\n");
            MessageWizard(delegate (string name)
            {
                Console.WriteLine("Anonymous delegate function");
                Console.WriteLine("Hello {0}....", name); 

            });
        }

        public static void Case5()
        {
            Console.WriteLine("\nCase 5:\n");
            MessageWizard((n) =>
            {
                Console.WriteLine("Lambda");
                Console.WriteLine("Hello {0}....", n);

            });

        }
    }
}
