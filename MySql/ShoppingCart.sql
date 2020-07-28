CREATE TABLE Customer(
	CUSTID INT NOT NULL,
	CUSTNAME VARCHAR(50) NOT NULL ,
	ADDRESS VARCHAR(50) NOT NULL ,
	CONTACTNO DOUBLE NOT NULL ,
	PRIMARY KEY (CUSTID)
);


CREATE TABLE Product(
	PRODID INT NOT NULL,
	PRODNAME VARCHAR(50) NOT NULL ,
	UNITPRICE FLOAT NOT NULL ,
	QUANTITY INT(11) NOT NULL ,
	DISCOUNTPER FLOAT NULL DEFAULT 0,
	PRIMARY KEY (PRODID)
);


CREATE TABLE LineItem (
	ITEMID INT NOT NULL,
	ORDERDATE DATETIME NOT NULL ,
	CUSTID INT NOT NULL ,
	PRODID INT NOT NULL ,
	UNIT INT NOT NULL,
	CONSTRAINT CUST_FK FOREIGN KEY (CUSTID) REFERENCES customer (CUSTID),
	CONSTRAINT PROD_FK FOREIGN KEY (PRODID) REFERENCES product (PRODID)
);


CREATE TABLE CustOrder (
	ORDERID INT NOT NULL,
	DATEOFORDER DATETIME NOT NULL ,
	CUSTID INT NOT NULL ,
	ITEMID INT NOT NULL ,
	PRIMARY KEY (ORDERID),
	CONSTRAINT FK_CUST FOREIGN KEY (CUSTID) REFERENCES customer (CUSTID)
);


INSERT INTO product VALUES
(101,'Organic Apple' , 6, 100,5.1),
(102,'Selected Mangoes' , 5, 100,5.1),
(103,'Kerla special Bananas' , 4.5, 100,0),
(104,'Pack of 6 Strawberries' , 60, 100,6),
(105,'Nagpur special Oranges' , 5, 100,10);


INSERT INTO customer VALUES
(1,'First Customer' , 'First Address' , 9874563210 ),
(2,'Second Customer' , 'Second Address', 9874563210 ),
(3,'Third Customer' , 'Third Address', 9874563210 ),
(4,'Fourth Customer' , 'Fourth Address', 9874563210 ),
(5,'Fifth Customer' , 'Fifth Address', 9874563210 );


INSERT INTO lineitem VALUES
(01,'2020-07-14',1,102,2),

(02,'2020-07-15',1,104,1),
(02,'2020-07-15',1,105,12),

(03,'2020-07-15',2,101,6),
(03,'2020-07-15',2,102,6),

(04,'2020-07-16',2,103,12),
(04,'2020-07-16',2,104,1),

(05,'2020-07-17',3,104,4);	


INSERT INTO custorder VALUES
(11,'2020-07-14',1,1),	
(21,'2020-07-15',2,3);	


--list of products, of first customer who has not put the order.
SELECT p.PRODID ,p.PRODNAME AS 'Product', p.UNITPRICE AS 'Unit Price', li.UNIT AS 'No of Unit'
FROM product p , lineitem li 
WHERE p.PRODID = li.PRODID
AND li.CUSTID = (SELECT CUSTID FROM customer WHERE CUSTNAME='first customer') 
AND li.ITEMID  NOT IN (SELECT ITEMID FROM custorder);

--invoice of all customers
SELECT c.CUSTNAME, c.ADDRESS, c.CONTACTNO, co.DATEOFORDER, 
SUM( l.UNIT * p.UNITPRICE) AS 'Amount to pay'
FROM customer c, product p,
custorder co, lineitem l  
WHERE c.CUSTID = co.CUSTID
AND p.PRODID = l.PRODID
AND co.ITEMID=l.ITEMID
GROUP BY co.ORDERID;

-- view all products
SELECT * FROM product;