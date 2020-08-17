using System;
using System.Collections.Generic;
using System.Text;

namespace Human_Behaviour_App
{
    class Men : IEmotionable, ISocializable
    {
        void ISocializable.wish()
        {
            Console.WriteLine("Men is Wishing...");
        }


        void ISocializable.depart()
        {
            Console.WriteLine("Men is Departing...");
        }


        void IEmotionable.cry()
        {
            Console.WriteLine("Men is Crying...");

        }


        void IEmotionable.laugh()
        {
            Console.WriteLine("Men is Laughing...");
        }
    }
}
