using System;
using System.Collections.Generic;
using System.Text;

namespace Human_Behaviour_App
{
    class Boy : IEmotionable
    {
		void IEmotionable.cry()
		{
			Console.WriteLine("Boy is Crying...");

		}

		
		 void IEmotionable.laugh()
		{
			Console.WriteLine("Boy is Laughing...");
		}
	}
}
