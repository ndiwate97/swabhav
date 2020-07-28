using System;

namespace ArrayApplication
{
    public class SeperateZeros
    {
        public static void seperateZerosAndNonZeros(int[] inputArray)
        {

            int pos = 0;
            for (int i = 0; i < inputArray.Length; i++)
            {
                if (inputArray[i] != 0)
                {
                    inputArray[pos] = inputArray[i];
                    pos++;
                }
            }
            while (pos < inputArray.Length)
            {
                inputArray[pos] = 0;
                pos++;
            }

            Console.WriteLine("\nInput Array After moving zeros to end :");
            for (int i = 0; i < inputArray.Length; i++)
                Console.Write(" " + inputArray[i]);
        }

        static void Main(String[] args)
        {

            int[] inputArray = { 12, 0, 7, 0, 8, 0, 3 };
            Console.WriteLine("Orignal Array : ");
            for (int i = 0; i < inputArray.Length; i++)
                Console.Write(" " + inputArray[i]);
            seperateZerosAndNonZeros(inputArray);
        }
    }
}