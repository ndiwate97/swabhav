using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ManApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Man x = new Boy();
            x.Play(); // who will paly



            Boy y = new Boy();
            y.Play();//who will play


            Man t = new Infant();

            t.Play();//who willpaly
        }
    }
}
