using System;

namespace Exception_App2
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                m1();
                Console.WriteLine("End of Program");
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception information: ", e.ToString());
            }
        }

        static void m1() 
        {
            Console.WriteLine("M1 is called");
		    m2();
        }

        static void m2() 
        {
            Console.WriteLine("M2 is called");
            m3();
        }

        static void m3() 
        {

            Console.WriteLine("M3 is called");
            throw new Exception();
        }
    }
}
