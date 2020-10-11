using System;
using System.Collections;
using System.Collections.Generic;
using System.Drawing;
using System.Reflection.Emit;
using System.Windows.Forms;
using TicTacToeFormApp;

namespace TicTacToeGameLib
{
    public class Cell : Form
    {
        public static Button[] cell;
        public static List<int> selectedPosition = new List<int>();


        public static bool IsPositionFree(int position)
        {
            if (selectedPosition.Contains(position))
            {
                Console.WriteLine("Position already occupied....");
                return false;
            }
            if (position <= (Board.BoardSize * Board.BoardSize))
            {
                selectedPosition.Add(position);
                return true;
            }
            else
            {
                Console.WriteLine("Invalid Position....");
                return false;
            }
        }

        public static TableLayoutPanel addCell(TableLayoutPanel board, int boardSize)
        {
            Console.WriteLine("Adding cells");

            cell = new Button[boardSize * boardSize];
            int x = boardSize * boardSize + 1;
            int y = boardSize * boardSize + 1;
            int j = 0;
            int i = 0;
            for (i = 0; i < boardSize * boardSize; i++, x += 100, j++)
            {
                int position = i;
                cell[i] = new Button();
                if (j == boardSize)
                {
                    j = 0;
                    y += 100;
                    x = 10;
                }
                cell[i].Text = "";
                cell[i].SetBounds(x, y, 100, 100);
                board.Controls.Add(cell[i]);
                cell[i].Click += delegate (object sender, EventArgs e) { PutMark(sender, e, position); };

            }
            return board;

        }

        private static void PutMark(object sender, EventArgs e, int position)
        {
            Console.WriteLine("Putting mark at position : " + position);
            if (cell[position].Text == "")
            {
                Player turn = Game.getTurn();
                Console.WriteLine("Its {0} turn", turn.PlayerName);
                Game.turn = turn;
                Game.noOfMoves += 1;
                Console.WriteLine(Game.noOfMoves + "------------" + turn.Mark.putString() + "----------------" + position);

                cell[position].Text = turn.Mark.putString();
                //cell[position].BackColor = Color.Red;
                Game.analyze();

            }
        }

    }
}
