using System;

namespace PassByReferenceApp
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = 10;
            Console.WriteLine("Orignal Number : "+ number);
            PrintNumberRef(ref number);
            Console.WriteLine("Number after modification(by ref) : " + number);

            int no;
            OutArgExample(out no);
            Console.WriteLine("Uninitialized Number after modification(by out) : " + number);

            //Send a comma-separated list of arguments of the specified type.
            UseParams(1, 2, 3, 4);
            UseParams(5, 6, 7);
            // A params parameter accepts zero or more arguments.
            // The following calling statement displays only a blank line.
            UseParams();
        }

        // Passing by reference using ref
        static void PrintNumberRef(ref int refParameter)
        {
            refParameter = 40;
        }
        // Passing by reference using out
        static void OutArgExample(out int number)
        {
            number = 44;
        }
        //Using params
        public static void UseParams(params int[] list)
        {
            for (int i = 0; i < list.Length; i++)
            {
                Console.Write(list[i] + " ");
            }
            Console.WriteLine();
        }
    }
}
