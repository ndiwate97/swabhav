using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LINQWithCollection1
{
    class Program
    {

        public static List<Student> students = new List<Student>
        {
            new Student
            {
                CGPA = 7.0f,
                Name = "Namrata",
                Location = "Mumbai"
            },
            new Student
            {
                CGPA = 7.8f,
                Name = "Tejashree",
                Location = "Mumbai"
            },
            new Student
            {
                CGPA = 7.10f,
                Name = "Pawan",
                Location = "Andheri"
            },
            new Student
            {
                CGPA = 6.00f,
                Name = "Yash",
                Location = "Mumbai"
            }
        };

        static void Main(string[] args)
        {
            // Case6();
            Console.WriteLine("All students : ");
            foreach (var s in students)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }
            var student = students.Where(stud => stud.CGPA > 7);
            Console.WriteLine("\nStudents with CGPA > 7 : ");

            foreach (var s in student)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }
        }
              

        private static void Case1()
        {

            var names = new string[] { "Namrata", "Tejashree", "Pawan" };
            Console.WriteLine("The name with Maximum length is : " + names.Max());

            IEnumerable<string> locations = new string[] { "mumbai", "pune", "banglore" };

            var locationInOrder = locations.OrderBy(loc => loc);
            Console.WriteLine("\nLocations in Ascending order");
            foreach (string location in locationInOrder)
                Console.WriteLine(location);

            Console.WriteLine("\nNames with more than 2 a :");

            Regex moreThan2a = new Regex(@"([^\\]*a){3,}[^\\]*", RegexOptions.IgnoreCase);

            foreach (string name in names)
            {
                if (moreThan2a.IsMatch(name))
                {
                    Console.WriteLine(name);
                }
            }

            //var moreAs = names.Where(name => { return (names.Count(c => c == 'a')) > 2 ? true : false; });
            //foreach (string name in moreAs)
            //{
            //    Console.WriteLine(name);
            //}

            var vowlesRegex = new Regex("(a|e|i|o|u)");
            var mostVowels = names.Max(name => vowlesRegex.Matches(name).Count);
            var result = names.First(name => vowlesRegex.Matches(name).Count == mostVowels);

            Console.WriteLine("\nThe name which have most vowels : " + result);

        }

        private static void Case2()
        {

            Console.WriteLine("List of students from Mumbai :");
            var studentsAtMumbai = students.Where(student => student.Location == "Mumbai");
            foreach (Student s in studentsAtMumbai)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }

            Console.WriteLine("\nList of the students whose CGPA >= 7 from Mumbai :");
            var cgpaCriteria = studentsAtMumbai.Where(student => student.CGPA >= 7);
            foreach (Student s in cgpaCriteria)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }

        }

        private static void Case3()
        {
            string folderPath = @"C:\Windows\System32";

            System.IO.DirectoryInfo dir = new System.IO.DirectoryInfo(folderPath);

            IEnumerable<System.IO.FileInfo> fileList = dir.GetFiles("*.*", System.IO.SearchOption.TopDirectoryOnly);

            var fiveLargest = fileList.OrderByDescending(f => f.Length).Take(5);

            Console.WriteLine("The 5 largest files under {0} are:", folderPath);

            foreach (var v in fiveLargest)
            {
                Console.WriteLine("{0}: {1} bytes", v.FullName, v.Length);
            }
        }

        private static void Case4()
        {
            //var cgpaIncrementedList = students.Where(student => student.CGPA += 10);
            var cgpaIncrementedList = students.Where(student =>
            {
                student.CGPA += 10;
                return true;
            });
            Console.WriteLine("Original students list :");
            foreach (Student s in students)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }

            Console.WriteLine("\nStudents list after CGPA increment by 10 : ");
            foreach (Student s in cgpaIncrementedList)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }

            Console.WriteLine("\nLocation wise student count : ");
            var studentGroup = students.GroupBy(student => student.Location);
            foreach(var grp in studentGroup)
            {
                Console.WriteLine("Location : {0} , Count : {1}",grp.Key, grp.Count());
            }

        }

        private static void Case5()
        {
            var goodStudents1 = students.Where(student => student.CGPA > 6 ).ToList();

            var goodStudents2 = students.Where(student => student.CGPA > 6);

            students.Add(new Student
            {
                CGPA = 8.0f,
                Name = "abc",
                Location = "pune"
            });

            Console.WriteLine("List did not show later added value\n");
            foreach (Student s in goodStudents1)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }

            Console.WriteLine("\n\nList shows later added value\n");
            foreach (Student s in goodStudents2)
            {
                Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            }

        }

        private static void Case6()
        {
            //-------------------------------Update Query-----------------------------------
            //students.Where(s => s.Name == "Namrata").Select(s => { s.Location = "new loc";
            //    s.CGPA = 0;
            //    return s; })
            //    .ToList();

            //foreach (Student s in students)
            //{
            //    Console.WriteLine("Name : {0} , Location : {1} , CGPA : {2} ", s.Name, s.Location, s.CGPA);
            //}
            //-------------------------------Update Query-----------------------------------

            List<int> numbers = new List<int> { 2, 4, 8, 10 };

            var squareOfNumbers = numbers.Select(num => num * num);

            Console.WriteLine("Orignal Numbers :");
            foreach (int i in numbers)
            {
                Console.Write(i + " ");
            }

            Console.WriteLine("\n\nNumbers after Square :");
            foreach (int i in squareOfNumbers)
            {
                Console.Write(i + " ");
            }

        }

    }
}

