using System;

namespace CommandLineDemo
{
    class Program
    {
        static void Main(string[] args)
        {
			int[] number = new int[args.Length - 2];
			for (int i = 0; i < args.Length - 2; i++)
			{
				number[i] = int.Parse(args[i]);
			}

			string action = args[args.Length - 1];
			Console.WriteLine(action);

			if (action.Equals("-even"))
				printEvenNo(number);
			else if (action.Equals("-odd"))
				printOddNo(number);
			else if (action.Equals("-prime"))
				printPrimeNo(number);
			else
				printArray(number);
		}

		private static void printEvenNo(int[] numbers)
		{
			Console.WriteLine("even no:");
			for (int i = 0; i < numbers.Length; i++)
			{
				if (numbers[i] % 2 == 0)
					Console.WriteLine(numbers[i] + " ");
			}
		}

		private static void printOddNo(int[] numbers)
		{
			Console.WriteLine("odd no:");
			for (int i = 0; i < numbers.Length; i++)
			{
				if (numbers[i] % 2 != 0)
					Console.WriteLine(numbers[i] + " ");
			}
		}

		private static void printPrimeNo(int[] numbers)
		{

			Console.WriteLine("Prime no:");
			for (int n = 0; n < numbers.Length; n++)
			{
				int num = numbers[n];
				bool flag = false;
				for (int i = 2; i <= num / 2; ++i)
				{

					if (num % i == 0)
					{
						flag = true;
					}
					break;
				}

				if (!flag)
					Console.WriteLine(num + " ");
			}
		}

		private static void printArray(int[] numbers)
		{
			Console.WriteLine("all no:");
			for (int i = 0; i < numbers.Length; i++)
			{
				Console.WriteLine(numbers[i] + " ");
			}

		}
	}
}
