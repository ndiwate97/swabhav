using System;

namespace InterfacePolymorphismApp.Model
{
	class Car : IMoveable
	{

		void IMoveable.Move()
		{
			Console.WriteLine("Car is moving");
		}

	}
}
