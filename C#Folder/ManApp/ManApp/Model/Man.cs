using System;
using System.Collections.Generic;
using System.Text;

namespace ManApp
{
    class Man
    {
        public virtual void Play()
		{
			Console.WriteLine("Man is playing");
		}

		public void Eat()
		{
			Console.WriteLine("Man is eating");
		}
	}
}
