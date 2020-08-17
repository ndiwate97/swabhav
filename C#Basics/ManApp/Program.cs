using System;

namespace ManApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Man m = new Man();
            Boy b = new Boy();
            Kid k = new Kid();
            Infant i = new Infant();

			case1();
			case2();
			case3();
			case4();
			case5();
			atThePark(i);
		}

		public static void atThePark(Man m)
		{
			Console.WriteLine("At the park");
			m.Plays();
		}

		public static void case1()
		{
			Console.WriteLine("Case 1:\n");
			Man x;//reference variable
			x = new Man();
			x.Plays();
			x.Reads();
		}

		public static void case2()
		{
			Console.WriteLine("\nCase 2:\n");
			Boy y;
			y = new Boy();
			y.Plays();
			y.Eats();
			y.Reads();
		}

		public static void case3()
		{
			Console.WriteLine("\nCase 3:\n");
			Man x;
			x = new Boy();
			x.Plays();
			x.Reads();
		}

		public static void case4() 
		{
			Console.WriteLine("\nCase 4:\n");
			atThePark(new Man());
			atThePark(new Boy());
			atThePark(new Kid());
			atThePark(new Infant());
		}

		public static void case5()
		{
			Console.WriteLine("\nCase 5:\n");
			Object x;
			x = 10;
			Console.WriteLine(x.GetType());
			x = "Hello";
			Console.WriteLine(x.GetType());
			x = new Man();
			Console.WriteLine(x.GetType());
		}
	}
}
