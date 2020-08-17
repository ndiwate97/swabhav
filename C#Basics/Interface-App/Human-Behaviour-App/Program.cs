using System;

namespace Human_Behaviour_App
{
    class Program
    {
        static void Main(string[] args)
        {
            Men m = new Men();
            atTheParty(m, m);
            atTheMovie(m);

            Boy b = new Boy();
            //atTheParty(b);
            atTheMovie(b);
        }

        private static void atTheMovie(IEmotionable e)
        {
            Console.WriteLine("\nAt The Movie : ");
            e.cry();
            e.laugh();
        }

        private static void atTheParty(IEmotionable e, ISocializable s)
        {
            Console.WriteLine("\nAt The Party : ");
            e.cry();
            e.laugh();
            s.wish();
            s.depart();
        }
    }
}
