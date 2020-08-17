using System;
using System.Collections.Generic;
using System.Text;

namespace Rectangle_app
{
    class Rectangle
    {

		readonly int START_RANGE = 1;
		readonly int END_RANGE = 100;

		//make this private and use getters and setters  
		private int width;
		private int height;
		private String color;

		//getter
		public int GetWidth() 
		{
			return width;
		}

		public int GetHeight()
		{
			return height;
		}

		public String GetColour()
		{
			return color;
		}


		//setter
		public void SetWidth(int width)
		{
			this.width = checkDimensions(width);
		}

		public void SetHeight(int height)
		{
			this.height = checkDimensions(height);
		}

		public void SetColor(String color)
		{
			this.color = checkColor(color);
		}


		public void CalculateArea()
		{
			Console.WriteLine("Area of Rectangle = " + (width * height));
		}



		private String checkColor(String colour)
		{
			if (colour.Equals("red") || colour.Equals("green") || colour.Equals("blue"))
				return (colour);
			else
				return ("Black");
		}

		private int checkDimensions(int val)
		{
			if (val < START_RANGE)
				return (START_RANGE);
			else if (val > END_RANGE)
				return (END_RANGE);
			else
				return (val);

		}

	}
}
