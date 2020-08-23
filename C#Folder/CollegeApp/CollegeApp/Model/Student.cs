using System;

namespace CollegeApp.Model
{
    class Student : Person
    {
        private Branch _branch;

        public Student(int id, string address, DateTime dateOfBirth, Branch branch) : base(id,address,dateOfBirth)
        {
            _branch = branch;
        }

        public Branch Branch { get => _branch; set => _branch = value; }
    }
}
