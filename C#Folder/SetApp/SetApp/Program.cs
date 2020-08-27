using System;
using System.Collections.Generic;
using SetApp.Model;

namespace SetApp
{
    class Program
    {
        static void Main(string[] args)
        {
            // Creating HashSet  
            HashSet<Student> students = new HashSet<Student>();

            // Add the elements in HashSet
            students.Add(new Student(1, "Namrata", 5));
            students.Add(new Student(1, "Xyz", 5));
            students.Add(new Student(2, "Tejashree", 4));
            students.Add(new Student(3, "Pawan", 5));
            students.Add(new Student(5, "Pawan", 1));

            //Display elements of students
            foreach (Student s in students)
            {
                Console.WriteLine(s);
            }

            //HashSet does not allow the duplicates into the collection.
            //but still in case of generic hashset (using class) it allows duplicate records. 
            //To overcome this drawback, we need to implement IEquatable interface, override Equals and GetHashCode methods.

        }
    }
}
