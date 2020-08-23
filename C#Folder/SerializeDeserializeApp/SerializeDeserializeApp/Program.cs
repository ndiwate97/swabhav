using System;
using StudentApp.Model;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace SerializeDeserializeApp
{
    class Program
    {
        static string path = "C:\\swabhav\\C#Folder\\SerializeDeserializeApp\\SerializeDeserializeApp\\student.txt";

        static void Main(string[] args)
        {
            //Student s = new Student();
            //s.FirstName = "Swabhav";
            //s.LastName = "Techlabs";

            //SaveStudentData(s);

            //Student ss = RetriveStudentData();
            //PrintStudentInfo(ss);

            Student[] students = new Student[3];
            for (int i = 0; i < students.Length; i++)
            {
                students[i] = new Student();
            }
            students[0].FirstName = "namrata";
            students[0].LastName = "diwate";

            students[1].FirstName = "yash";
            students[1].LastName = "diwate";

            students[2].FirstName = "sangeeta";
            students[2].LastName = "diwate";

            SaveStudentsData(students);

            Student[] retrivedStudents = RetriveStudentsData();
            foreach(Student s in retrivedStudents)
            {
                PrintStudentInfo(s); 
            }

        }
        private static void SaveStudentsData(Student[] students)
        {
            FileStream stream = new FileStream(path, FileMode.OpenOrCreate);
            BinaryFormatter formatter = new BinaryFormatter();
            formatter.Serialize(stream, students);
            stream.Close();
        }
        private static Student[] RetriveStudentsData()
        {
            FileStream stream = new FileStream(path, FileMode.OpenOrCreate);
            BinaryFormatter formatter = new BinaryFormatter();
            return (Student[])formatter.Deserialize(stream);
        }

        private static void SaveStudentData(Student s)
        {
            FileStream stream = new FileStream(path, FileMode.OpenOrCreate);
            BinaryFormatter formatter = new BinaryFormatter();
            formatter.Serialize(stream, s);
            stream.Close();
        }

        private static Student RetriveStudentData()
        {
            FileStream stream = new FileStream(path, FileMode.OpenOrCreate);
            BinaryFormatter formatter = new BinaryFormatter();
            return (Student)formatter.Deserialize(stream);
        }

       


        private static void PrintStudentInfo(Student s)
        {

            Console.WriteLine("\nFirst Name : " + s.FirstName);
            Console.WriteLine("Last Name : " + s.LastName);
            Console.WriteLine("Full Name : " + s.FullName);
        }
    }
}
