using System;
using System.Collections.Generic;
using System.Text;

namespace Vehical_App
{
	class Bike : IMoveable
	{

		void IMoveable.start()
		{
			Console.WriteLine("Bike Starts....");
		}


		void IMoveable.stop()
		{
			Console.WriteLine("Bike Stops....");
		}

	}
}
