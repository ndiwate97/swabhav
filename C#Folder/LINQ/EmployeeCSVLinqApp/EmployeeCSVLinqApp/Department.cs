namespace EmployeeCSVLinqApp
{
    class Department
    {
        public int DepartmentNo { get; set; }
        public string DepartmentName { get; set; }
        public string Location { get; set; }

        public override string ToString()
        {
            return "\nDepartment No =" + DepartmentNo + ",Department Name = " + DepartmentName + ", Location = " + Location;
        }
    }
}