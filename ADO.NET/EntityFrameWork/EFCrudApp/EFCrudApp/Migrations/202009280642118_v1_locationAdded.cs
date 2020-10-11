namespace EFCrudApp.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class v1_locationAdded : DbMigration
    {
        public override void Up()
        {
            AddColumn("dbo.Students", "Location", c => c.String());
        }
        
        public override void Down()
        {
            DropColumn("dbo.Students", "Location");
        }
    }
}
