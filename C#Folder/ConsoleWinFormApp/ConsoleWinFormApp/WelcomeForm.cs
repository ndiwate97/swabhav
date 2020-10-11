using System.Windows.Forms;
using System.Drawing;
using System;

namespace ConsoleWinFormApp
{
    class WelcomeForm : Form
    {
        public Button helloButton;

        public WelcomeForm()
        {
            this.Width = 300;
            this.Height = 300;
            this.Text = "Welcome Window";
            helloButton = new Button();
            helloButton.Text = "Hello..!";
            helloButton.Location = new Point(100, 100);
            this.Controls.Add(helloButton);

            //helloButton.Click += helloHandler;
            helloButton.Click += (sender, e) => MessageBox.Show("You have clicked Hello...!");
        }

        //private void helloHandler(object sender, EventArgs e)
        //{
        //    MessageBox.Show("You have clicked Hello...!");
        //}
    }
}
