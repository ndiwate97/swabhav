using System;

namespace StackOverflowTest
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("I'm inside main..");
            try
            {
                m1();
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception information: ", e.ToString());
            }
        }

        private static void m1()
        {
            Console.WriteLine("I'm inside m1..");
            Main(null);
            m2();
        }

        private static void m2()
        {
            Console.WriteLine("I'm inside m2..");
        }
    }
}
