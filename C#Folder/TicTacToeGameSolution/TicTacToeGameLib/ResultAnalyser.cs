using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TicTacToeGameLib
{
    public class ResultAnalyser : Form
    {
        Button[] cell;

        public ResultAnalyser(Button[] cell)
        {
            this.cell = cell;
        }

        private bool checkVertical()
        {
            int i, j;
            for (i = 0; i <= Board.BoardSize * (Board.BoardSize - 1); i = i + Board.BoardSize)
            {
                for (j = i; j < i + (Board.BoardSize - 1); j++)
                {
                    if (cell[i].Text == "")
                        return false;
                    else
                    {
                        if (!cell[j].Text.Equals(cell[j + 1].Text))
                            break;
                    }

                }
                if (j == i + (Board.BoardSize - 1))
                {
                    return true;
                }
            }
            return false;
        }

        private bool checkHorizontal()
        {

            int i, j;
            for (i = 0; i < Board.BoardSize; i++)
            {
                for (j = i; j < i + (Board.BoardSize * (Board.BoardSize - 1)); j = j + Board.BoardSize)
                {

                    Console.WriteLine("j======" + j + "-----------" + Cell.cell[j].Text);

                    String one = Cell.cell[j].Text;
                    String two = Cell.cell[j + Board.BoardSize].Text;

                    if (one.Equals(""))
                        break;

                    if (!one.Equals(two))
                        break;

                }
                if (j == i + (Board.BoardSize * (Board.BoardSize - 1)))
                {
                    return true;
                }
            }
            return (false);

        }

        private bool checkDiagonally()
        {

            int i = 0;
            for (i = Board.BoardSize - 1; i < Board.BoardSize
                    * (Board.BoardSize - 1); i += Board.BoardSize - 1)
            {

                if (cell[i].Text.Equals(""))
                    return false;
                else
                {
                    if (!cell[i].Text.Equals(cell[i + Board.BoardSize - 1].Text))
                        break;
                }

            }

            if (i == Board.BoardSize * (Board.BoardSize - 1))
                return true;
            return false;

        }

        private bool checkAntiDiagonally()
        {

            int i = 0;
            for (i = 0; i < (Board.BoardSize * Board.BoardSize) - 1; i += Board.BoardSize + 1)
            {

                if (cell[i].Text == "")
                    return false;
                else
                {
                    if (!cell[i].Text.Equals(cell[i + Board.BoardSize + 1].Text))
                        break;
                }

            }

            if (i == (Board.BoardSize * Board.BoardSize) - 1)
                return true;
            return false;

        }

        public bool checkWin()
        {
            return (checkHorizontal() || checkVertical() || checkDiagonally() || checkAntiDiagonally());
            // return  checkHorizontal();
        }
    }
}
