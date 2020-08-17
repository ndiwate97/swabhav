using System;
using System.Collections.Generic;
using System.Text;

namespace ManApp
{
    class Boy : Man
    {
		public override void Plays()
		{
			Console.WriteLine("Boy is playing ");
		}

		public void Eats()
		{
			Console.WriteLine("Boy is eating");
		}
	}
}
