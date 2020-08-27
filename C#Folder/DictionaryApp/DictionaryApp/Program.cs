using System;
using System.Collections.Generic;
using System.Linq;

namespace DictionaryApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<int, string> applications = new Dictionary<int, string>();

            // Add elements to the dictionary. 
            applications.Add(1, "notepad");
            applications.Add(2, "paint");
            applications.Add(3, "excel");
            applications.Add(4, "wordpad");

            //Display elements of the dictionary.
            Console.WriteLine("Applications : ");
            foreach (KeyValuePair<int, string> kvp in applications)
                Console.WriteLine("Key: {0}, Value: {1}", kvp.Key, kvp.Value);

            //Updating value
            applications[1] = "Notepad++";

            Console.WriteLine("\nApplications after update : ");
            foreach (KeyValuePair<int, string> kvp in applications)
                Console.WriteLine("Key: {0}, Value: {1}", kvp.Key, kvp.Value);

            //Removes the value with the specified key
            applications.Remove(4);
            applications.Remove(1);

            Console.WriteLine("\nApplications after Deleting some applications  : ");
            foreach (KeyValuePair<int, string> kvp in applications)
                Console.WriteLine("Key: {0}, Value: {1}", kvp.Key, kvp.Value);

        }
    }
}
