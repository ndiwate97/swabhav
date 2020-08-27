using System;

namespace InterfacePolymorphismApp.Model
{
	class Truck : IMoveable
	{

		void IMoveable.Move()
		{
			Console.WriteLine("Truck is moving");
		}

	}
}
