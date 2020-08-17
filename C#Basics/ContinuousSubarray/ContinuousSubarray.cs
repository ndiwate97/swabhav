using System;

namespace ArrayApplication
{
    public class PairOfElements
    {
        public static void findContinuousSubArray(int[] element, int no)
        {

            for (int i = 0; i < element.Length - 1; i++)
            {
                int j = i;
                int sum = 0;
                while (sum < no && j < element.Length)
                {
                    sum = sum + element[j];
                    if (sum == no)
                    {
                        Console.WriteLine("\nContinuous Sub Array :");
                        for (int start = i; start <= j; start++)
                            Console.Write(" " + element[start]);
                    }
                    j++;
                }

            }

        }

        static void Main(String[] args)
        {

            int[] inputArray = { 42, 15, 12, 8, 6, 32 };
            int inputNumber = 26;

            Console.WriteLine("Given Array : ");
            for (int i = 0; i < inputArray.Length; i++)
                Console.Write(inputArray[i] + " ");

            Console.WriteLine("\nSum : " + inputNumber);

            findContinuousSubArray(inputArray, inputNumber);
        }
    }
}