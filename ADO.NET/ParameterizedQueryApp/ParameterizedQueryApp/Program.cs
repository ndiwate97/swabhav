using System;
using System.Data.SqlClient;
using System.Configuration;

namespace ParameterizedQueryApp
{
    class Program
    {
        public static SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["localmachine"].ConnectionString);

        static void Main(string[] args)
        {

            try
            {
                con.Open();
                //Case1();
                //Case2();
                //Case3();
                Case4();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                con.Close();
            }
        }

        private static void Case1()
        {
            Console.WriteLine("Case 1 :\n");
            //sql injection            
            Console.WriteLine("Enter employee id : ");
            string employeeNo = Console.ReadLine();

            string queryString = "SELECT * FROM EMP where EMPNO = " + employeeNo;

            SqlCommand cmd = new SqlCommand(queryString, con);

            Console.WriteLine("EMPNO\tName\tJob\t\tMGR\tHire\tDate\tSalary\tComm\tDepart no");
            using (SqlDataReader reader = cmd.ExecuteReader())
            {
                while (reader.Read())
                {

                    Console.WriteLine(string.Format("{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}",
                        reader[0], reader[1], reader[2], reader[3], reader[4], reader[5], reader[6], reader[7]));

                }
            }
        }

        private static void Case2()
        {
            Console.WriteLine("Case 2 : \n");
            //Using parameters to avoid sql injection
            Console.WriteLine("Enter employee id : ");
            string employeeNo = Console.ReadLine();
            string queryString = "SELECT * FROM EMP where DEPTNO = @employeeNo ";

            SqlCommand cmd = new SqlCommand(queryString, con);
            cmd.Parameters.Add("@employeeNo", System.Data.SqlDbType.VarChar);
            cmd.Parameters["@employeeNo"].Value = employeeNo;

            Console.WriteLine("EMPNO\tName\tJob\t\tMGR\tHire\tDate\tSalary\tComm\tDepart no");
            using (SqlDataReader reader = cmd.ExecuteReader())
            {
                while (reader.Read())
                {

                    Console.WriteLine(string.Format("{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}",
                        reader[0], reader[1], reader[2], reader[3], reader[4], reader[5], reader[6], reader[7]));

                }
            }

        }

        private static void Case3()
        {
            //update
            Console.WriteLine("Update employees salary..\nEnter employee id  : ");
            string employeeNo = Console.ReadLine();

            string queryString = "UPDATE EMP SET SAL = 20000 where EMPNO = @employeeNo ;" +
                "SELECT * FROM EMP WHERE EMPNO = @employeeNo;";

            SqlCommand cmd = new SqlCommand(queryString, con);
            cmd.Parameters.Add("@employeeNo", System.Data.SqlDbType.VarChar);
            cmd.Parameters["@employeeNo"].Value = employeeNo;

            Console.WriteLine("EMPNO\tName\tJob\t\tMGR\tHire\tDate\tSalary\tComm\tDepart no");
            using (SqlDataReader reader = cmd.ExecuteReader())
            {
                while (reader.Read())
                {

                    Console.WriteLine(string.Format("{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}",
                        reader[0], reader[1], reader[2], reader[3], reader[4], reader[5], reader[6], reader[7]));

                }
            }

        }

        private static void Case4()
        {
            Console.WriteLine("Delete Employee....\nEnter employee id : ");
            string employeeNo = Console.ReadLine();

            string queryString = "DELETE FROM EMP where EMPNO = @employeeNo ; " +
                "SELECT* FROM EMP WHERE EMPNO = @employeeNo; ";

            SqlCommand cmd = new SqlCommand(queryString, con);
            cmd.Parameters.Add("@employeeNo", System.Data.SqlDbType.VarChar);
            cmd.Parameters["@employeeNo"].Value = employeeNo;

            Console.WriteLine("EMPNO\tName\tJob\t\tMGR\tHire\tDate\tSalary\tComm\tDepart no");
            using (SqlDataReader reader = cmd.ExecuteReader())
            {
                while (reader.Read())
                {

                    Console.WriteLine(string.Format("{0}\t{1}\t{2}\t{3}\t{4}\t{5}\t{6}\t{7}",
                        reader[0], reader[1], reader[2], reader[3], reader[4], reader[5], reader[6], reader[7]));

                }
            }

        }
    }
}
