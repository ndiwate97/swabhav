using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CollegeApp.Model
{
    class Professor : Person
    {
        private float _basicSalary;
        private const float _HRA = 50;
        private const float _TA = 40;
        private float _grossSalary;

        public Professor(int id, string address, DateTime dateOfBirth, float basicSalary) : base(id, address, dateOfBirth)
        {
            this._basicSalary = basicSalary;
        }

        public float BasicSalary { get => _basicSalary; }

        public float GrossSalary { get => _grossSalary = _basicSalary + (_basicSalary * (_HRA / 100)) + (_basicSalary * (_TA / 100)); }
    }
}
