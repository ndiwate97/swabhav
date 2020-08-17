using System;

namespace GuessTheNumber
{
    class Program
    {

        public  const int START = 1;
        public  const int EXIT = 2;

        static void Main(string[] args)
        {
			int choice = 0;
			bool newGame = true, retry;

			Game g = new Game();

			while (choice != EXIT)
			{

				if (newGame)
					Console.WriteLine("1.Start\n2.Exit\nEnter your Choice : ");
			else
					Console.WriteLine("1.Restart\n2.Exit\nEnter your Choice : ");
				choice = Convert.ToInt32(Console.ReadLine());

				switch (choice)
				{
					case START:
						retry = true;
						Random randomNumber = new Random();
						int systemNumber = randomNumber.Next(11);
						while (retry)
						{
							Console.WriteLine("Enter Your Guessed number (within 0-10): ");
							int userNumber = Convert.ToInt32(Console.ReadLine());
							if (userNumber > 10)
								Console.WriteLine("Your number excide the limit...!");
							else
								retry = g.startGame(systemNumber, userNumber);
						}
						newGame = false;
						break;

					case EXIT:
						Console.WriteLine("Game Over....!");
						break;

					default:
						Console.WriteLine("Invalid Choice");
						break;
				}
			}
		}

	}
}