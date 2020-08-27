using System;

namespace InterfacePolymorphismApp.Model
{
	class Bike : IMoveable
	{

		void IMoveable.Move()
        {
			Console.WriteLine("Bike is moving");
        }

	}
}
