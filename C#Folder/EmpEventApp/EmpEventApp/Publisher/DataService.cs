using System;
using System.Collections.Generic;
using System.IO;
using System.Net;

namespace EmpEventApp.Publisher
{
    public delegate void DResponse(List<Employee> response);
    class DataService
    {
        List<Employee> employees = new List<Employee>();

        public event DResponse RequestComplete = null;

        public void ProcessData()
        {

            var url = "https://swabhav-tech.firebaseapp.com/emp.txt";
            WebRequest request = HttpWebRequest.Create(url);
            WebResponse response = request.GetResponse();
            StreamReader reader = new StreamReader(response.GetResponseStream());

            string responseText;

            while ((responseText = reader.ReadLine()) != null)
            {

                string[] data = responseText.Split(',');

                int employeeId = int.Parse(data[0]);
                string employeeName = data[1].Substring(1, data[1].Length - 2);
                string designation = data[2].Substring(1, data[2].Length - 2);
                int managerId = int.Parse(CheckNull(data[3]));
                string dateOfJoining = data[4].Substring(1, data[4].Length - 2);
                double salary = double.Parse(data[5]);
                double commission = double.Parse(CheckNull(data[6]));
                int deptId = int.Parse(data[7]);

                Employee e = new Employee(employeeId, employeeName, designation, managerId, dateOfJoining, salary,
                        commission, deptId);
                employees.Add(e);

                //Console.WriteLine("----"+employeeId + " " + employeeName + " " + designation + " " + managerId + " "
                //                + dateOfJoining + " " + salary + " " + commission + " " + deptId);
                
            }

            if (RequestComplete != null)
            {
                RequestComplete(employees);
            }
        }

        private static String CheckNull(String data)
        {
            if (data.Equals("NULL"))
            {
                return "0";
            }
            return data;
        }
    }
}
