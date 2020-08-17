using System;
using System.Collections.Generic;
using System.Text;

namespace Vehical_App
{
    class Car : IMoveable
    {
		void IMoveable.start()
		{
			Console.WriteLine("Car Starts....");
		}

		
		void IMoveable.stop()
		{
			Console.WriteLine("Car Stops....");
		}

	}
}
