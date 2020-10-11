CREATE TABLE Customer
	(
	CustId int NOT NULL PRIMARY KEY,
	Name varchar(10) NOT NULL,
	PhoneNo int NOT NULL,
	Address varchar(50) NOT NULL
	)  ;

CREATE TABLE Orders
	(
	OrderId int NOT NULL PRIMARY KEY,
	CustId int NOT NULL FOREIGN KEY REFERENCES Customer(CustId),
	DeliveryDate date NOT NULL,
	OrderDate date NOT NULL
	);

CREATE TABLE LineItem
	(
	LineItem int NOT NULL PRIMARY KEY,
	OrderId int NOT NULL FOREIGN KEY REFERENCES Orders(OrderId),
	Product varchar(50) NOT NULL,
	Quantity int NOT NULL
	);
