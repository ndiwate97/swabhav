namespace OneToManyApp.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class v1_addingCustOrderTables : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Customer",
                c => new
                    {
                        CustId = c.Int(nullable: false, identity: true),
                        Name = c.String(),
                        PhoneNumber = c.Double(nullable: false),
                        Location = c.String(),
                    })
                .PrimaryKey(t => t.CustId);
            
            CreateTable(
                "dbo.Orders",
                c => new
                    {
                        OrderId = c.Int(nullable: false, identity: true),
                        ProdName = c.String(),
                        UnitPrice = c.Double(nullable: false),
                        Quantity = c.Int(nullable: false),
                        Customer_CustId = c.Int(),
                    })
                .PrimaryKey(t => t.OrderId)
                .ForeignKey("dbo.Customer", t => t.Customer_CustId)
                .Index(t => t.Customer_CustId);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.Orders", "Customer_CustId", "dbo.Customer");
            DropIndex("dbo.Orders", new[] { "Customer_CustId" });
            DropTable("dbo.Orders");
            DropTable("dbo.Customer");
        }
    }
}
