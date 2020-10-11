using ContactStoreConsoleApp.DBContext;
using ContactStoreConsoleApp.Model;
using ContactStoreConsoleApp.Repository;
using ContactStoreConsoleApp.Service;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ContactStoreConsoleApp
{
    class Program
    {
        private const int ADD = 1;
        private const int MODIFY = 2;
        private const int SEARCH = 3;
        private const int DELETE = 4;
        private const int EXIT = 5;

        static void Main(string[] args)
        {
			ContactService service = new ContactService(new ContactEFRepository(new ContactDbContext()));

			

            int choice = 0;
            while (choice != 5)
            {
				Console.WriteLine("\n");
				foreach (var c in service.GetContacts())
				{
					Console.WriteLine("Id : {0}, First Name : {1}, Last Name : {2}, Phone No : {3}", c.Id, c.FirstName, c.LastName, c.PhoneNo);
				}

				Console.WriteLine("\n1. Add to Contact\n2. Modify Contact\n3. Search Contact\n4. Delete Contact\n5. Exit");
                Console.WriteLine("Enter Your Choice : ");
                choice = int.Parse(Console.ReadLine());

				switch (choice)
				{
                    case ADD:
                        AddContact(service);
                        break;

                    case MODIFY:
						ModifyContact(service);
						break;

                    case SEARCH:

                        SearchContact(service);
                        break;

                    case DELETE:
                        DeleteContact(service);
                        break;

                    case EXIT:
						Console.WriteLine("Exit Successfully...!");						
						break;

					default:
						Console.WriteLine("Invalid Choice....!");
						break;
				}
			}

        }

        private static void DeleteContact(ContactService service)
        {
            Console.WriteLine("Enter Contact ID you want to delete : ");
            int id = int.Parse(Console.ReadLine());

            service.DeleteContact(id);
        }

        private static void SearchContact(ContactService service)
        {
            Console.WriteLine("Enter the key to search the contact :");
            String searchKey = Console.ReadLine();
            List<Contact> searchedContacts = service.SearchContact(searchKey);
            Console.WriteLine("Searched Contacts :\n");
            foreach (var c in searchedContacts)
            {
                Console.WriteLine("Id : {0}, First Name : {1}, Last Name : {2}, Phone No : {3}", c.Id, c.FirstName, c.LastName, c.PhoneNo);
            }
        }

        private static void ModifyContact(ContactService service)
        {
			Console.WriteLine("Enter Contact Id you want to Modify : ");
			int id = int.Parse(Console.ReadLine());

			Console.WriteLine("What do you want to modify?\n1.First Name\n2.Last Name\n3.Phone No.");
			int choice = int.Parse(Console.ReadLine());
			Console.WriteLine("Enter Modification :");
			String modification = Console.ReadLine();
			service.EditContact(choice, id, modification);
		}

        private static void AddContact(ContactService service)
        {
            Console.WriteLine("Enter First name : ");
            String fName = Console.ReadLine();
            Console.WriteLine("Enter Last name : ");
            String lName = Console.ReadLine();
            Console.WriteLine("Enter Phone No : ");
            long phoneNo = long.Parse(Console.ReadLine());
            service.AddContact(new Contact { FirstName = fName, LastName = lName, PhoneNo = phoneNo });
        }
    }
}
