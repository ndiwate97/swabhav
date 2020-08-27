using System;
using System.Collections.Generic;

namespace ShoppingCartApp.Model
{
    class Order
    {
        private int _id;
        private DateTime _date;
        private List<LineItem> _items = new List<LineItem>();

        public Order(int id, DateTime date)
        {
            _id = id;
            _date = date;
        }

        public void AddItem(LineItem item)
        {
            bool isadded = false;
            if (!_items.Equals(null))
            {
                foreach (LineItem i in _items)
                {

                    if (i.Product.Equals(item.Product))
                    {
                        i.Quantity += item.Quantity;
                        isadded = true;
                    }
                }
                if (!isadded)
                    _items.Add(item);
            }
            else
                _items.Add(item);


        }

        public double CheckoutCost()
        {
            double checkoutCost = 0;
            foreach(LineItem i in _items)
            {
                checkoutCost += i.CalculateItemCost();
            }
            return checkoutCost;
        }

        public int Id { get => _id; }

        public DateTime Date { get => _date; }

        internal List<LineItem> Items { get => _items; }

        public override string ToString()
        {
            return "\nOrder Id : " + Id + ", Date : " + Date + ",\n\tLine Item List : \n" + string.Join(Environment.NewLine, _items)+"\nCheckout Price : "+CheckoutCost(); 
        }
    }
}
