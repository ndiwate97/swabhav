using System;

namespace candidate_app
{
    class Program
    {
        static void Main(string[] args)
        {
            Candidate c1 = new Candidate(10, 25, "abc", CreditPoint.A);
            printInfo(c1);

            Candidate c2 = new Candidate(-10, 30, "xyz", CreditPoint.B);
            printInfo(c2);
        }

        private static void printInfo(Candidate c)
        {
            Console.WriteLine("\nId = " + c.getId());
            Console.WriteLine("Name = " + c.getName());
            Console.WriteLine("Age = " + c.getAge());
            Console.WriteLine("Credit Point = " + c.getCreditPoint());
        }
    }
}
