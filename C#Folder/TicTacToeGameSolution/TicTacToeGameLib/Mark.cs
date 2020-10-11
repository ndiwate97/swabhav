using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TicTacToeGameLib
{
    public enum Mark
    {
        NOUGHT, CROSS, BLANK
    }

    public static class MarkVal
    {
        public static string putString(this Mark m)
        {
            switch (m)
            {
                case Mark.NOUGHT:
                    return "O";
                case Mark.CROSS:
                    return "X";
                case Mark.BLANK:
                    return "-";
                default:
                    return "invalid";
            }
        }
    }

}
