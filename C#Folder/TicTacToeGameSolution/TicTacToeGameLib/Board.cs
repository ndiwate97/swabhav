using System;
using System.Windows.Forms;

namespace TicTacToeGameLib
{
    public class Board : Form
    {
		private static int boardSize;
		TableLayoutPanel gameBoard = new TableLayoutPanel();

		public Board(int boardSize)
		{
			Console.WriteLine("Inside Board Constructor with board size : {0}",boardSize);
			gameBoard.ColumnCount = boardSize;
			gameBoard.RowCount = boardSize;

			gameBoard = Cell.addCell(gameBoard, boardSize);

			Board.boardSize = boardSize;
		}

		public static int BoardSize { get => boardSize; }
        public TableLayoutPanel GameBoard { get => gameBoard; }
    }
}
