using System;
using System.Data.SqlClient;
using System.Configuration;


namespace TransactionApp
{
    class Program
    {
        public static SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["localmachine"].ConnectionString);

        public static SqlTransaction transaction;

        static void Main(string[] args)
        {
            Console.WriteLine("Enter Your Customer id : ");
            string custid = Console.ReadLine();

            Console.WriteLine("Enter Merchant id : ");
            string merchantId = Console.ReadLine();

            Console.WriteLine("Enter Amount to be paid : ");
            string amount = Console.ReadLine();

            string customerQuery = "UPDATE CUST SET Balance = Balance-@amount WHERE CUSTID=@custid;";
            
            string merchantQuery = "UPDATE Merchant SET Balance = Balance+@amount WHERE MerchId=@merchantId;";

            try
            {
                con.Open();
                transaction = con.BeginTransaction();

                SqlCommand updateCustomer = new SqlCommand(customerQuery, con, transaction);
                updateCustomer.Parameters.Add("@custid", System.Data.SqlDbType.VarChar);
                updateCustomer.Parameters["@custid"].Value = custid;
                updateCustomer.Parameters.Add("@amount", System.Data.SqlDbType.VarChar);
                updateCustomer.Parameters["@amount"].Value = amount;

                SqlCommand updateMerchant = new SqlCommand(merchantQuery, con, transaction);
                updateMerchant.Parameters.Add("@merchantId", System.Data.SqlDbType.VarChar);
                updateMerchant.Parameters["@merchantId"].Value = merchantId;
                updateMerchant.Parameters.Add("@amount", System.Data.SqlDbType.VarChar);
                updateMerchant.Parameters["@amount"].Value = amount;

                int updateCustomerCount = updateCustomer.ExecuteNonQuery();
                int updateMerchantCount = updateMerchant.ExecuteNonQuery();

                if(updateCustomerCount==0 || updateMerchantCount ==0)
                {
                    // throw Exception;

                    Console.WriteLine("Transaction failed.......");
                    transaction.Rollback();
                }
                else
                {
                    transaction.Commit();
                }

            }
            catch (Exception e)
            {

                Console.WriteLine("Transaction failed.......");
                Console.WriteLine(e.Message);
                transaction.Rollback();
            }
            finally
            {
                con.Close();
            }
        }
    }
}
