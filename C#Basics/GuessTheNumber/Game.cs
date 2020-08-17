using System;
using System.Collections.Generic;
using System.Text;

namespace GuessTheNumber
{
    class Game
    {
		private int systemNumber;

		public bool startGame(int systemNumber, int userNumber)
		{
			if (systemNumber > userNumber)
			{
				Console.WriteLine("Your guess is low");
				return true;
			}
			else if (systemNumber < userNumber)
			{
				Console.WriteLine("Your guess is high");
				return true;
			}
			else
			{
				Console.WriteLine("Your guess is right....!");
				return false;
			}
		}
	}
}
