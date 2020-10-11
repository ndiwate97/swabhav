using System;
using System.Drawing;
using System.Windows.Forms;
using TicTacToeGameLib;

namespace TicTacToeFormApp
{
    public class Program : Form
    {
        public static Player p1;
        public static Player p2;
        public static Board board;


        static Panel panel;

        static Label player1 = new Label();
        static Label player2 = new Label();
        static Label boardSizeLabel = new Label();

        static TextBox p1Info = new TextBox();
        static TextBox p2Info = new TextBox();
        static TextBox boardSizeText = new TextBox();

        static Button button = new Button();

        public Program()
        {
            Console.WriteLine("in constructor");
            startGame();
        }

        public static void Main(string[] args)
        {
            Application.EnableVisualStyles();
            Application.Run(new Program());
        }

        public void startGame()
        {
            if (this.Controls.Count > 0)
                this.Controls.Clear();
            panel = new Panel();


            Console.WriteLine("start game");
            player1.Text = "Enter Name of Player1 :";
            player1.Width = 130;
            player1.Location = new Point(10, 10);

            p1Info.Text = "";
            p1Info.Width = 60;
            p1Info.Location = new Point(140, 10);

            player2.Text = "Enter Name of Player2 :";
            player2.Width = 130;
            player2.Location = new Point(10, 40);

            p2Info.Text = "";
            p2Info.Width = 60;
            p2Info.Location = new Point(140, 40);

            boardSizeLabel.Text = "Enter Board size (eg. 3 for 3*3) : ";
            boardSizeLabel.Width = 100;
            boardSizeLabel.Location = new Point(10, 70);

            boardSizeText.Width = 60;
            boardSizeText.Location = new Point(140, 70);

            button.Text = "Submit";
            button.Width = 60;
            button.Location = new Point(100, 100);

            button.Click += SubmitHandler;

            panel.Width = 300;
            panel.Height = 300;
            panel.Controls.Add(player1);
            panel.Controls.Add(p1Info);
            panel.Controls.Add(player2);
            panel.Controls.Add(p2Info);
            panel.Controls.Add(boardSizeLabel);
            panel.Controls.Add(boardSizeText);
            panel.Controls.Add(button);
            this.Controls.Add(panel);
            this.Width = 300;
            this.Height = 300;

            Application.EnableVisualStyles();
        }

        private void SubmitHandler(object sender, EventArgs e)
        {
            Console.WriteLine("Inside Submit Handler");
            String player1Name = p1Info.Text;
            String player2Name = p2Info.Text;
            int boardSize;

            if (player1Name.Equals(""))
            {
                player1Name = "Player1";
            }

            if (player2Name.Equals(""))
            {
                player2Name = "Player2";
            }
            if (boardSizeText.Text.Equals(""))
            {
                boardSize = 3;
            }
            else
            {
                boardSize = int.Parse(boardSizeText.Text);
            }


            p1 = new Player(player1Name, Mark.CROSS);
            p2 = new Player(player2Name, Mark.NOUGHT);

            board = new Board(boardSize);


            Console.WriteLine("{0} and {1} is playing with Board size : {2}", p1.PlayerName, p2.PlayerName, boardSize);

            //				showRules();

            showBoard();
        }

        public void showBoard()
        {

            Console.WriteLine("showBoard called");
            Game newGame = new Game(board, this);

            this.Controls.Remove(panel);


            panel = board.GameBoard;
            panel.Width = (Board.BoardSize * 100) + 35;
            panel.Height = (Board.BoardSize * 100) + 60;

            this.Controls.Add(panel);
            this.Width = (Board.BoardSize * 100) + 35;
            this.Height = (Board.BoardSize * 100) + 60;


            Player turn = Game.getTurn();
            this.Text = "Its " + turn.PlayerName + "'s Turn...";



        }
    }
}
