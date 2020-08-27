using System;
using CalcEventApp.Publisher;

namespace CalcEventApp.Subscriber
{
    class Program
    {
        static void Main(string[] args)
        {
            Calculator c = new Calculator();

            c.AdditionCompleted += PrintAdditionDetails;
            c.SubtractionCompleted += PrintSubstractionDetails;

            c.Add(2, 3);
            c.Substract(10, 5);
        }

        private static void PrintAdditionDetails(int x, int y,int result)
        {
            Console.WriteLine("\nAddition of {0} and {1} is Done...!", x, y) ;
            Console.WriteLine("Result : "+ result);
        }

        private static void PrintSubstractionDetails(int x, int y, int result)
        {
            Console.WriteLine("\nSubtraction of {0} and {1} is Done...!", x, y);
            Console.WriteLine("Result : " + result);
        }
    }
}
