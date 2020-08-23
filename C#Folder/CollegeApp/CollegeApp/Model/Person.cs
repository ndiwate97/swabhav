using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CollegeApp.Model
{
    class Person
    {
        private int _id;
        private string _address;
        private DateTime _dateOfBirth;

        public Person(int id, string address, DateTime dateOfBirth)
        {
            this._id = id;
            this._address = address;
            this._dateOfBirth = dateOfBirth;
        }

        public int Id { get => _id; }

        public string Address { get => _address; }

        public DateTime DateOfBirth { get => _dateOfBirth; }
    }
}
