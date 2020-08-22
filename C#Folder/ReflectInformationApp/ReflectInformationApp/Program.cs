using System;
using System.Reflection;

namespace ReflectInformationApp
{
    class Program
    {
        static void Main(string[] args)
        {
          
            Type t = typeof(StudentApp.Model.Student);

            Console.WriteLine("Class : "+ t);

            MethodInfo[] m = t.GetMethods();
            PrintMembers(m);

        }

        public static void PrintMembers(MemberInfo[] ms)
        {
            foreach (MemberInfo m in ms)
            {
                Console.WriteLine( m);
            }
            Console.WriteLine();
        }
    }
}
