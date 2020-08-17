using System;

namespace Multilevel_inheritance_app
{
    class Program
    {
        static void Main(string[] args)
        {
            Child c = new Child();

            c.childMessage();
            c.parentMessage();
            c.superParentMessage();
        }
    }
}
