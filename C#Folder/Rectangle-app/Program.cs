using System;

namespace Rectangle_app
{
    class Program
    {
        static void Main(string[] args)
        {
			Rectangle r1 = new Rectangle();

			r1.SetWidth(-10);
			r1.SetHeight(200);
			r1.SetColor("ReD");
			r1.CalculateArea();

			printInfo(r1);

			Console.WriteLine(r1.GetHashCode());

		}

		public static void printInfo(Rectangle r)
		{
			
			Console.WriteLine("Colour of Rectangle =" + r.GetColour());
			Console.WriteLine("Width of Rectangle = " + r.GetWidth());
			Console.WriteLine("Height of Rectangle = " + r.GetHeight());

			Console.WriteLine(r.GetHashCode());
		}
	}
}
