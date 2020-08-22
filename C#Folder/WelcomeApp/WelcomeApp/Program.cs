using System;

namespace WelcomeApp
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.ForegroundColor = ConsoleColor.Blue;
            Console.BackgroundColor = ConsoleColor.Yellow;

            string name = "Not Defined";
            string college = "Not Defined";
            float cgpa = 0.0f;

            if(args.Length==3)
            {
                name = args[0];
                cgpa = float.Parse(args[1]);
                college = args[2];
            }

            Console.WriteLine("Name : " + name);
            Console.WriteLine("CGPA : " + cgpa);
            Console.WriteLine("College : " + college);
        }

    }
}
