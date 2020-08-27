using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CollectionApp.Model
{
    class LineItem
    {
        private int _id;
        private string _name;
        private double _cost;
        private int _quantity;
        private static double _totalCost = 0;

        public LineItem(int id, string name, double cost, int quantity)
        {
            _id = id;
            _name = name;
            _cost = cost;
            _quantity = quantity;
            _totalCost += (_cost*quantity);
        }

        public int Id { get => _id; }
        public string Name { get => _name; }
        public double Cost { get => _cost; }
        public int Quantity { get => _quantity; }
        public static double TotalCost { get => _totalCost; }

        public override string ToString()
        {
            return "\nId : " + _id + "\nName : " + _name + "\nCost : " + _cost + "\nQuantity : " + _quantity;
        }
    }
}
