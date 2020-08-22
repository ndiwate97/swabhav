using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PassbyValueApp
{
    class Program
    {
        static void Main(string[] args)
        {
            int mark = 100;
            Modify(mark);
            Console.WriteLine("Integer value after modify : "+mark);

            int[] marks = { 10, 20, 30 };
            Modify(marks);
            Console.Write("Array value after modify : ");
            foreach(int m in marks)
            {
                Console.Write(m);
            }



            Point point1 = new Point(10,20);
            Modify(point1);
            Console.WriteLine("\nPoint values after modify : " + point1.x + " " + point1.y);

        }

        private static void Modify(Point point1)
        {
            point1.x = 0;
            point1.y = 0;
        }

        private static void Modify(int[] marks)
        {
            for(int i = 0; i<marks.Length; i++)
            {
                marks[i] = 0;
            }
        }

        private static void Modify(int mark)
        {
            mark = 0;
        }
    }
}
