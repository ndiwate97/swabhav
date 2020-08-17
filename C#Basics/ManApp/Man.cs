using System;
using System.Collections.Generic;
using System.Text;

namespace ManApp
{
    class Man
    {
        public virtual void Plays()
		{
			Console.WriteLine("Man is playing");
		}

		public void Reads()
		{
			Console.WriteLine("Man is reading");
		}
	}
}
