using System;

namespace ShoppingCartApp.Model
{
    class LineItem
    {
        private int _id;
        private int _quantity;
        private Product _product;

        public LineItem(int id, int quantity, Product product)
        {
            _id = id;
            _quantity = quantity;
            _product = product;
        }

        public double CalculateItemCost()
        {
            return _quantity * _product.TotalCost;
        }

        public int Id { get => _id; }

        public int Quantity { get => _quantity; set => _quantity = value; }
        
        internal Product Product { get => _product;}

        public override string ToString()
        {
            return "\t\tLine item Id : " + Id + ", Products : " + Product + ", Quantity : " + Quantity +", Total Cost : "+CalculateItemCost();
        }
    }
}
