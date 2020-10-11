namespace OneToManyApp.Model
{
    public class Order
    {
        public int OrderId { get; set; }
        public string ProdName { get; set; }
        public double UnitPrice { get; set; }
        public int Quantity { get; set; }
        public Customer Customer { get; set; }
    }
}