using System;

namespace PassByValue
{
    class Program
    {
        static void Main(string[] args)
        {

			int no = 10;
			PrintNumber(no);
			Console.WriteLine("PrintNumber(no) : " + no);

			PrintNumberRef(ref no);
			Console.WriteLine("PrintNumberRef(ref no) : " + no);

			int[] arr = { 10, 20, 30, 40 };
			PrintArrayvalue(arr);
			for (int i = 0; i < arr.Length; i++)
			{
				Console.WriteLine(arr[i]);
			}
		}


		// Passing by value
		static void PrintNumber(int number)
		{
			number = 20;
		}
		
		// Passing by reference
		static void PrintNumberRef(ref int refParameter)
		{
			refParameter = 40;
		}

		static void PrintArrayvalue(int[] arr)
		{
			for (int i = 0; i < arr.Length; i++)
			{
				arr[i] = 0;
			}

		}

		
	}
}
