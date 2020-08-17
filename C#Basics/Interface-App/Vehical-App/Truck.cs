using System;
using System.Collections.Generic;
using System.Text;

namespace Vehical_App
{
    class Truck : IMoveable
    {
		void IMoveable.start()
		{
			Console.WriteLine("Truck Starts....");
		}

		
		void IMoveable.stop()
		{
			Console.WriteLine("Truck Stops....");
		}
	}
}
