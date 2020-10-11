using System;
using System.Data.SqlClient;
using System.Configuration;

namespace CommandApp
{
    class Program
    {
        static void Main(string[] args)
        {
            //string connectionString = "server=.\\SQLExpress; Database=Namrata;User Id=sa;Password=root;";
            //SqlConnection con = new SqlConnection(connectionString);

            SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["localmachine"].ConnectionString);

            string queryString = "SELECT * FROM EMP ";

            try
            {
                con.Open();
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
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            finally
            {
                con.Close();
            }

        }
    }
}
