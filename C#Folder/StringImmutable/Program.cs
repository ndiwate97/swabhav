using System;

namespace StringImmutable
{
    class Program
    {
        static void Main(string[] args)
        {
            string s1 = "String 1 ";
            string s2 = "String 2 ";

            s1 += s2;

            System.Console.WriteLine(s1);



            String name = "Namrata";
            Console.WriteLine("Name is " + name.GetHashCode());
            Console.WriteLine(name.ToUpper().GetHashCode());
            Console.WriteLine(name.ToLower().GetHashCode());
            name = "new name";
            Console.WriteLine(name.GetHashCode());



            String str1 = "demo";
            String str2 = "demo";
            String str3 = "Test";

            Console.WriteLine("str1.GetHashCode() ------>" + str1.GetHashCode());
            Console.WriteLine("str2.GetHashCode() ------>" + str2.GetHashCode());
            Console.WriteLine("str3.GetHashCode() ------>" + str3.GetHashCode());

            //comparison operator

            Console.WriteLine("(str1 == str2) ---------->" + (str1 == str2));
            Console.WriteLine("(str1 == str3) ---------->" + (str1 == str3));


            Console.WriteLine((str1.Equals(str2)));
            Console.WriteLine((str1.Equals(str3)));

        }
    }
}
