using System;

namespace ArrayApplication
{
    public class RemoveDuplicate
    {
        public static int[] uniqueArray(int[] array)
        {

            int[] a ;
            int Length = array.Length-1;
            for (int i = 0; i < Length; i++)
            {
                
                for (int j = i + 1; j < Length;)
                {
                    if (array[j] == array[i])
                    {
                        for (int k = j; k < Length; k++)
                        {
                            array[k] = array[k + 1];
                        }
                        Length--;
                    }
                    else
                    {
                        j++;
                    }
                }
            }

            a= new int[Length];
            for(int i = 0 ; i< Length;i++){
                a[i]=array[i];
            }
            return a;
        }

        static void Main(String[] args)
        {

            int[] input = { 1, 2, 3, 4, 1, 6, 3, 4 };
            Console.WriteLine("Original array :");
            foreach (int i in input)
            {
                Console.Write(i + " ");
            }
            Console.WriteLine("\nUnique array :");
            foreach (int i in uniqueArray(input))
            {
                Console.Write(i + " ");
            }
        }
    }
}