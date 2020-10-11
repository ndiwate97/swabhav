using System;

namespace ExtensionMethodApp
{
    using ExtensionMethodApp.CustomExt;
    class Program
    {
        static void Main(string[] args)
        {
            String text = "Welcome to C#";

            Console.WriteLine(text.ToSnake_Case());
        }
    }
}
