using System;

namespace ArrayApplication
{
    public class MissingNumber
    {
        public static void findMissingNo(int[] inputArray)
        {

            int total = (inputArray.Length + 1) * (inputArray.Length + 2) / 2;
            for (int i = 0; i < inputArray.Length; i++)
                total -= inputArray[i];
            Console.WriteLine("\nMissing Number is = " + total);

        }

        static void Main(String[] args)
        {

            int[] inputArray = { 1, 4, 5, 3, 2, 8, 6 };

            Console.WriteLine("Given Array : ");
            for (int i = 0; i < inputArray.Length; i++)
                Console.Write(inputArray[i] + " ");

            findMissingNo(inputArray);
        }
    }
}