using System;

namespace Exception_App
{
    class Program
    {
        static void Main(string[] args)
        {
			try
			{
				int a = Convert.ToInt32(args[0]);
				int b = Convert.ToInt32(args[1]);

				int c = a / b;
			}
			catch (FormatException e)
			{ 
				Console.WriteLine("Exception information: ", e.ToString());
			}
			catch (ArithmeticException e)
			{
				
				Console.WriteLine("Exception information: ", e.ToString());
			}
			catch (IndexOutOfRangeException e)
			{
				Console.WriteLine("Exception information: ", e.ToString());
			}

			Console.WriteLine("End of the program");
		}
    }
}
