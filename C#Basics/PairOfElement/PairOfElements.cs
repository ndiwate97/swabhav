using System;

namespace ArrayApplication
{
    public class PairOfElements
    {
        public static void findPairs(int[] element, int no) {

		Console.WriteLine("Pairs of elements whose sum is " + no + " are :");

		for (int i = 0; i < element.Length - 1; i++) {
			for (int j = i + 1; j < element.Length; j++) {
				if (element[i] + element[j] == no) {
					Console.WriteLine(element[i] + " + " + element[j] + " = " + no);
				}
			}
		}

        }

        static void Main(String[] args)
        {

            int[] inputArray = { 4, 6, 5, -10, 8, 5, 20 };
            int inputNumber = 10;
             Console.WriteLine("Given Array : ");
            for (int i = 0; i < inputArray.Length; i++)
                Console.Write( inputArray[i]+ " ");
            Console.WriteLine("\nSum : "+inputNumber);
            findPairs(inputArray, inputNumber);
        }
    }
}