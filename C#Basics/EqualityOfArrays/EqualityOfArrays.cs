using System;

namespace ArrayApplication
{
    public class EqualityOfArrays
    {
        public static bool isEqual(int[] arrayOne, int[] arrayTwo)
        {
            bool isEqual = true;
            if (arrayOne.Length == arrayTwo.Length)
            {
                for (int i = 0; i < arrayOne.Length; i++)
                {
                    if (arrayOne[i] != arrayTwo[i])
                    {
                        isEqual = false;
                    }
                }
            }
            else
            {
                isEqual = false;
            }

            return isEqual;
        }

        static void Main(String[] args)
        {

            int[] input1 = { 1, 2, 3, 4 };
            int[] input2 = { 1, 2, 3, 4 };

            if (isEqual(input1, input2))
            {
                Console.WriteLine("Two Arrays Are Equal");
            }
            else
            {
                Console.WriteLine("Two Arrays Are Not equal");
            }
        }
    }
}