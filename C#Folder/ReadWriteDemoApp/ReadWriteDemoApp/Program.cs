using System;
using System.IO;

namespace ReadWriteDemoApp
{
    class Program
    {
        static void Main(string[] args)
        {
            string path = "C:\\swabhav\\C#Folder\\ReadWriteDemoApp\\ReadWriteDemoApp\\Test.txt";

            try
            {
                WriteIntoTxt(path);
                ReadFromTxt(path);
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: " + e.Message);
            }
        }

        private static void WriteIntoTxt(string path)
        {
            StreamWriter sw = new StreamWriter(path);
            sw.WriteLine("Hello World!!");
            sw.WriteLine("Line 2 writting using StreamWriter....");
            sw.Close();
        }

        private static void ReadFromTxt(string path)
        {
            string line;
            StreamReader sr = new StreamReader(path);
            Console.WriteLine("Reading form txt....");
            line = sr.ReadLine();
            while (line != null)
            {
                Console.WriteLine(line);
                line = sr.ReadLine();
            }
            sr.Close();
        }
    }
}
