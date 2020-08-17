using System;

namespace Single_inheritance
{
    class Program
    {
        static void Main(string[] args)
        {
            ChildClass c = new ChildClass();

            c.childMessagePrint(); 
            c.parentMessagePrint();
        }
    }
}
