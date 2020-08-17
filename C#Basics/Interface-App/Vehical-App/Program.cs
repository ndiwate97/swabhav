using System;

namespace Vehical_App
{
    class Program
    {
        static void Main(string[] args)
		{
			//case 1
			Console.WriteLine("Case 1 :");
			Truck t = new Truck();
			Car c = new Car();
			Bike b = new Bike();

			printMovableObject(t, c, b);

			//case 2
			Console.WriteLine("\nCase 2 :");
			IMoveable[] im = new IMoveable[3];

			im[0] = new Truck();
			im[1] = new Car();
			im[2] = new Bike();

			printMoveableObject(im);
			

		}

		private static void printMovableObject(IMoveable t, IMoveable c, IMoveable b)
		{
			t.start();
			t.stop();
			c.start();
			c.stop();
			b.start();
			b.stop();
		}

		private static void printMoveableObject(IMoveable[] im)
		{
			for (int i = 0; i < im.Length; i++)
			{
				im[i].start();
				im[i].stop();
			}
		}
	}
}
