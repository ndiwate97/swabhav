using System;

namespace StudentApp.Model
{
    public class Student
    {
        private string _firstName = "null";
        private string _lastName = "null";
        private IQLevel _iqLevel;

        public string FirstName
        {
            get
            {
                return _firstName;
            }
            set
            {
                if (CheckLength(value))
                {
                    _firstName = value;
                }
                else
                {
                    _firstName = "Default Value";
                }

            }
        }

        public string LastName
        {
            get => _lastName;
            set
            {
                if (CheckLength(value))
                {
                    _lastName = value;
                }
                else
                {
                    _lastName = "Default Value";
                }
            }
        }

        public string FullName { get => _firstName + " " + _lastName; }

        internal IQLevel IqLevel { get => _iqLevel; set => _iqLevel = value; }

        private bool CheckLength(string str)
        {
            if (str.Length >= 5)
                return true;
            else
                return false;
        }

        public bool IsLongName()
        {
            if (this.FullName.Length > 12 )
                return true;
            else
                return false;
        }

    }
}
