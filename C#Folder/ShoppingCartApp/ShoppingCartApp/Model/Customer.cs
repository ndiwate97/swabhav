using System;
using System.Collections.Generic;

namespace ShoppingCartApp.Model
{
    class Customer
    {
        private int _id;
        private String _name;
        private String _address;
        private List<Order> _orders = new List<Order>();

        public Customer(int id, string name, string address)
        {
            _id = id;
            _name = name;
            _address = address;
        }

        public void AddOrder(Order order)
        {
            _orders.Add(order);

        }

        public int Id { get => _id; }

        public string Name { get => _name; }

        public string Address { get => _address; }

        internal List<Order> Orders { get => _orders; }

    }
}
