using System;

namespace SetApp.Model
{
    public class Student : IEquatable<Student>
    {
        private int _rollNo;
        private string _name;
        private int _standard;

        public Student(int rollNo, string name, int standard)
        {
            _rollNo = rollNo;
            _name = name;
            _standard = standard;
        }

        public int RollNo { get => _rollNo; }
        public string Name { get => _name; }
        public int Standard { get => _standard; }

        public bool Equals(Student obj)
        {
            return this.RollNo.Equals(obj.RollNo) && this.Standard.Equals(obj.Standard);
        }

        public override int GetHashCode()
        {
            return this.RollNo.GetHashCode();
        }

        public override string ToString()
        {
            return "Roll no : " + RollNo + ", Standard : " + Standard + ", Name :" + Name;
        }


    }
}
