using System;

namespace MathDelegateApp
{
    public delegate void DOperation(int a, int b);

    class Program
    {
        static void Main(string[] args)
        {
            Case1();
            Case2();
        }

        public static void Add(int a, int b)
        {
            Console.WriteLine(a + " + " + b + " = " + (a + b));
        }

        public static void Subtract(int a, int b)
        {
            Console.WriteLine(a + " - " + b + " = " + (a - b));
        }

        public static void Division(int a, int b)
        {
            Console.WriteLine(a + " / " + b + " = " + (a / b));
        }

        public static void Case1()
        {
            Console.WriteLine("Case 1 : \n");

            DOperation d = Add;
            d(10, 20);
            d = Subtract;
            d(30, 20);
            d = Division;
            d(10, 2);
        }

        public static void Case2()
        {
            Console.WriteLine("\nCase 2 : \n");

            DOperation[] delegates = new DOperation[3];
            delegates[0] = (a, b) => Add(a, b);
            delegates[1] = (a, b) => Subtract(a, b);
            delegates[2] = (a, b) => Division(a, b);
            
            foreach(DOperation ds in delegates)
            {
                ds(40, 5);
            }
        }
    }


}
