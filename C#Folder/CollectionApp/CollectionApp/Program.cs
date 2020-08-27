using System;
using System.Collections;
using System.Collections.Generic;

namespace CollectionApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Case1();
            Case2();
        }

        private static void Case1()
        {
            Console.WriteLine("Case 1 : ");
            ArrayList list = new ArrayList();
            list.Add(new Model.LineItem(1, "Item1", 100, 5));
            list.Add(new Model.LineItem(1, "Item2", 150, 4));
            list.Add(new Model.LineItem(1, "Item3", 50, 1));
            list.Add("Hello");
            foreach (object o in list)
            {
                Console.WriteLine(o);
            }
            Console.WriteLine("Total Cost of products : " + Model.LineItem.TotalCost);
        }

        private static void Case2()
        {
            Console.WriteLine("\nCase 2 : ");
            List<Model.LineItem> list = new List<Model.LineItem>();
            list.Add(new Model.LineItem(1, "Item1", 100, 5));
            list.Add(new Model.LineItem(1, "Item2", 150, 4));
            list.Add(new Model.LineItem(1, "Item3", 50, 1));
            foreach (object o in list)
            {
                Console.WriteLine(o);
            }
            Console.WriteLine("Total Cost of products : " + Model.LineItem.TotalCost);
        }
    }
}
