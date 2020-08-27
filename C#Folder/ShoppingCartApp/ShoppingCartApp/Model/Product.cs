using System;

namespace ShoppingCartApp.Model
{
    class Product
    {
        private int _id;
        private string _name;
        private double _price;
        private float _discountPercentage;

        public Product(int id, string name, double price, float discountPercentage)
        {
            _id = id;
            _name = name;
            _price = price;
            _discountPercentage = discountPercentage;
        }

        public int Id { get => _id; }

        public string Name { get => _name; }

        public double Price { get => _price; }

        public float DiscountPercentage { get => _discountPercentage; }

        public double TotalCost { get => Price - (Price * DiscountPercentage / 100); }

        public override string ToString()
        {
            return 
                "\n\t\t\tProduct Id : " + Id + ", Name : " + Name + ", Unit Price : " + Price + ", Discount% given : " + DiscountPercentage + ", Final Price : " + TotalCost;
        }
    }
}
