using InterfacePolymorphismApp.Model;
using System;

namespace InterfacePolymorphismApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Model.IMoveable[] Vehicals = new Model.IMoveable[3];

            Vehicals[0] = new Model.Truck();
            Vehicals[1] = new Model.Car();
            Vehicals[2] = new Model.Bike();

            StartRace(Vehicals);

        }

        private static void StartRace(IMoveable[] vehicals)
        {
            foreach(IMoveable v in vehicals)
            {
                v.Move();
            }
        }
    }
}
