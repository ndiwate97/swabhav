using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGameLib
{
    public enum Result
    {
        WIN, DRAW, IN_PROGRESS
    }
    public static class DeclareResult
    {
        public static string ResultMsg(this Result r)
        {
            switch (r)
            {
                case Result.WIN:
                    return "Wins the Game";
                case Result.DRAW:
                    return "The game is Draw";
                case Result.IN_PROGRESS:
                    return "Game is in progress...";
                default:
                    return "Unspecified";
            }
        }
    }
}
