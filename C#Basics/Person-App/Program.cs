using System;

namespace Person_App
{
    class Program
    {
        static void Main(string[] args)
        {
            Person p = new Person("person", 25, "female", 60, 5.5f);

            Console.WriteLine("person information :");
            PrintInfo(p);

            p.DoEat();
            Console.WriteLine(p.GetName() + "'s Weight after Eating: " + p.GetWeight());

            p.DoWorkOut();
            Console.WriteLine(p.GetName() + "'s Weight after WorkOut: " + p.GetWeight());

        }

        public static void PrintInfo(Person p)
        {
            Console.WriteLine("Name : " + p.GetName());
            Console.WriteLine("Age : " + p.GetAge());
            Console.WriteLine("Gender : " + p.Getgender());
            Console.WriteLine("Weight : " + p.GetWeight());
            Console.WriteLine("Height : " + p.GetHeight());
        }
    }
}
