using System;
using System.Runtime.CompilerServices;
using System.Windows.Forms;
using TicTacToeFormApp;

namespace TicTacToeGameLib
{
    public class Game : Form
    {
        public static Board board;
        public static Player turn;
        public static ResultAnalyser analyse;
        public static int noOfMoves = 0;
        public static Program currentGame;

        public Game(Board b, Program program)
        {
            board = b;
            analyse = new ResultAnalyser(Cell.cell);
            turn = Program.p2;
            currentGame = program;
            Console.WriteLine("First turn is : " + turn.PlayerName);
        }

        public static Player getTurn()
        {
            if (turn.Equals(Program.p1))
            {
            
                Program.ActiveForm.Text=  "Its " + turn.PlayerName + "'s Turn...";
                return Program.p2;
            }
            else
            {
                Program.ActiveForm.Text = "Its " + turn.PlayerName + "'s Turn...";
                return Program.p1;
            }

        }

        public static TableLayoutPanel showRules(Board b)
        {

            TableLayoutPanel rulesPanel = new TableLayoutPanel();

            TextBox rules = new TextBox();
            rules.SetBounds(250, 200, 100, 100);
            rules.Text = "\nRules:\nThree marks of same type appear in a row\n either vertically or horizontally or diagonally,"
                            + "\nthe user of that mark will be declared\n winner by the system. "
                            + "\n\nIf all the squares of the board are\n filled and no user is the winner then";
            rulesPanel.Controls.Add(rules);

            return rulesPanel;
        }

        public static void analyze()
        {

            if (analyse.checkWin())
            {

                showResult(turn.PlayerName + " " + Result.WIN.ResultMsg());

            }

            if (noOfMoves == Board.BoardSize * Board.BoardSize)
            {
                showResult("" + Result.DRAW.ResultMsg());
            }
        }

        private static void showResult(String result)
        {
            string title = "Result";
            result += "\nDo You Want to Restart..??";
            MessageBoxButtons buttons = MessageBoxButtons.YesNo;
            DialogResult d = MessageBox.Show(result, title, buttons);
            if (d == DialogResult.Yes)
            {
                //currentGame.Controls.Remove(board.GameBoard);
                //new Program();
                Application.Restart();
            }
            else
            {
                currentGame.Close();
            }
        }
    }
}
