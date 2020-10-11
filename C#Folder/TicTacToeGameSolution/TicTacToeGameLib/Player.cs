using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGameLib
{
    public class Player
    {
		private String playerName;
		private Mark mark;

		public Player(String playerName, Mark mark)
		{
			this.playerName = playerName; 
			this.mark = mark;
		}

		public Mark Mark { get => mark; }

		public String PlayerName { get => playerName; }
	}
}
