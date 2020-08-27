using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FuncActionApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Case1();
            Case2();
            Case3();
        }

        private static void Case1()
        {
            Console.WriteLine("Case 1 : Func<string, int> \n");
            Func<string, int> x = GetNoOfVowels;
            Console.WriteLine("No of vowels in Namrata : {0}", x("Namrata"));
            x = (str) =>
            {
                int aCount = 0;
                for (int i = 0; i < str.Length; i++)
                {
                    if (str[i] == 'a' || str[i] == 'A')
                    {
                        aCount++;
                    }
                }
                return aCount;
            };
            Console.WriteLine("No of a in Namrata : {0}", x("namrata"));
        }

        private static void Case2()
        {
            Console.WriteLine("\nCase 2 : Action<int> \n");
            Action<int> y = DisplayEvenNos;
            y(20);
            y = (number) =>
            {
                int no = number;
                int digitCount = 0;
                do
                {
                    number = number / 10;
                    digitCount++;
                } while (number > 0);

                Console.WriteLine("No of digits in {0} : {1}", no, digitCount);
            };
            y(1234);

        }

        private static void Case3()
        {
            Console.WriteLine("\nCase 3 : Predicate<int> \n");
            Predicate<int> z = IsPrimeNo;
            int no = 20;
            Console.WriteLine("{0} is prime no : {1}", no, z(no));

            z = (num) =>
            {
                if (num % 2 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            };
            Console.WriteLine("{0} is even no : {1}\n", no, z(no));

        }

        private static bool IsPrimeNo(int number)
        {
            bool isPrime = true;
            for (int i = 2; i <= number / 2; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }

        private static void DisplayEvenNos(int limit)
        {
            Console.WriteLine("Even no till {0} : ", limit);
            for (int i = 0; i <= limit; i++)
            {
                if ((i % 2) == 0)
                {
                    Console.Write(i + " ");
                }
            }
            Console.WriteLine();
        }

        private static int GetNoOfVowels(string str)
        {
            int vowels = 0;
            for (int i = 0; i < str.Length; i++)
            {

                if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
                {
                    vowels++;
                }
            }
            return vowels;
        }
    }
}
