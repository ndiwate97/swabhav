using System;

namespace OverloadingApp
{
    class Program
    {
        static void Main(string[] args)
        {
            PrintInfo("String...!");
            PrintInfo(200);
            PrintInfo(5000.5);

            int[] evenNos = GetEvenNos(10, 100);

            Console.WriteLine(string.Join(" ", evenNos));
            foreach (int i in evenNos)
            {
                Console.Write(" ", i);
            }
        }

        private static int[] GetEvenNos(int startIndex, int endIndex)
        {
            int[] arr = new int[endIndex/2];
            int position = 0;

            for(int i = startIndex; i <= endIndex; i++ )
            {
                if (i % 2 == 0)
                {
                    arr[position] = i;
                    position++;

                }
            }

            return arr;
                
        }

        private static void PrintInfo(string stringValue)
        {
            Console.WriteLine("Printing String : " + stringValue);
        }

        private static void PrintInfo(int intValue)
        {
            Console.WriteLine("Printing Integer : " + intValue);
        }

        private static void PrintInfo(double doubleValue)
        {
            Console.WriteLine("Printing Double : " + doubleValue);
        }

        
    }
}
