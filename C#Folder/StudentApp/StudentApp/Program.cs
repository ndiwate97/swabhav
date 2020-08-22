using StudentApp.Model;
using System;

namespace StudentApp
{
    public class Program
    {
        static void Main(string[] args)
        {
            Student s = new Student();
            s.FirstName = "Swa";
            s.LastName = "Techlabs";
            s.IqLevel = IQLevel.AboveAverage;
            PrintStudentInfo(s);
            Student[] students = new Student[5];
            for(int i=0; i < students.Length; i++)
            {
                students[i] = new Student();
            }
            students[0].FirstName = "nam";
            students[0].LastName = "diwate";
            students[0].IqLevel = IQLevel.Average;

            students[1].FirstName = "namra";
            students[1].LastName = "diwate";
            students[0].IqLevel = IQLevel.Average;

            students[2].FirstName = "sangeeta";
            students[2].LastName = "diw";
            students[0].IqLevel = IQLevel.AboveAverage;

            students[3].FirstName = "sangeeta";
            students[3].LastName = "diwate";
            students[0].IqLevel = IQLevel.Average;

            students[4].FirstName = "xyzzz";
            students[4].LastName = "abccc";
            students[0].IqLevel = IQLevel.BelowAverage;

            DisplayStudentHavingLongName(students);
            DisplayStudentHavingShortName(students);
        }

        private static void DisplayStudentHavingLongName(Student[] students)
        {
            Console.WriteLine("\nStudents with Long Name : \n");
           for(int i = 0; i < students.Length; i++)
            {
                if (students[i].IsLongName())
                    PrintStudentInfo(students[i]);
            }
        }

        private static void DisplayStudentHavingShortName(Student[] students)
        {
            Console.WriteLine("\nStudents with Short Name : \n");
            for (int i = 0; i < students.Length; i++)
            {
                if (!students[i].IsLongName())
                    PrintStudentInfo(students[i]);
            }
        }

        private static void PrintStudentInfo(Student s)
        {
            Console.WriteLine("\nFirst Name : " + s.FirstName);
            Console.WriteLine("Last Name : " + s.LastName);
            Console.WriteLine("Full Name : " + s.FullName);
            Console.WriteLine("IQ Level : " + s.IqLevel);
            Console.WriteLine("Is the full name is long name.. : " + s.IsLongName());
        }
    }
}
