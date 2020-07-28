using System;
using System.Collections.Generic;
using System.Text;

namespace candidate_app
{
    class Candidate
    {
        private static int defaultId = 0;
        private int id, age;
        private string name;
        private CreditPoint creditPoint;


		public Candidate(int id, int age, string name, CreditPoint creditPoint)
		{
			this.id = checkID(id);
			this.name = checkName(name);
			this.age = age;
			this.creditPoint = creditPoint;
		}

		private string checkName(string s)
		{
			if (s.Equals(" ") || s.Equals("null"))
				return "Unspecified";
			else
				return s;
		}

		private int checkID(int id)
		{
			if (id < 0)
				return ++defaultId;
			else
				return id;
		}

		//getters
		public int getId()
		{
			return id;
		}

		public string getName()
		{
			return name;
		}

		public int getAge()
		{
			return age;
		}

		public CreditPoint getCreditPoint()
		{
			return creditPoint;
		}

	}
}
