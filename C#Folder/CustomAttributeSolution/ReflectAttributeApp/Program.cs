using System;
using System.Reflection;

namespace ReflectAttributeApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Type t = typeof(CustomAttributeApp.Foo);
            Attribute arr = new CustomAttributeApp.NeedToRefactor();
            if (arr.Equals(t.GetCustomAttribute<CustomAttributeApp.NeedToRefactor>()))
            {
                Console.WriteLine("Class that is NeedToRefactor : "+ t);
            }
            MethodInfo[] m = t.GetMethods();
            PrintMembers(m,arr);

        }

        public static void PrintMembers(MemberInfo[] ms, Attribute arr)
        {
            Console.WriteLine("Methods that is NeedToRefactor : " );
            foreach (MemberInfo m in ms)
            {
                //Console.WriteLine(m+"--------"+arr);
                if (arr.Equals(m.GetCustomAttribute<CustomAttributeApp.NeedToRefactor>()))
                {
                    Console.WriteLine(m);
                }
            }
            Console.WriteLine();
        }
    }
}
