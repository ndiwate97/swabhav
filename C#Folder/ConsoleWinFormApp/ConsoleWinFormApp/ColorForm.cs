using System;
using System.Drawing;
using System.Windows.Forms;

namespace ConsoleWinFormApp
{
    class ColorForm : Form
    {
        public Button redButton;
        public Button blueButton;

        public ColorForm()
        {
            this.Width = 400;
            this.Height = 300;
            this.Text = "Colour the form";

            redButton = new Button();
            redButton.Text = "Red";
            redButton.Location = new Point(100, 100);

            blueButton = new Button();
            blueButton.Text = "Blue";
            blueButton.Location = new Point(200, 100);

            this.Controls.Add(redButton);
            this.Controls.Add(blueButton);

            redButton.Click += CommonHandler;
            blueButton.Click += CommonHandler;
        }

        private void CommonHandler(object sender, EventArgs e)
        {
            if(sender == redButton)
            {
                this.BackColor = Color.Red;
            }
            else
            {
                this.BackColor = Color.Blue;
            }
        }

    }
}
