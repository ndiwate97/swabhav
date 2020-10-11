CREATE TABLE Department (
    DeptNo int NOT NULL PRIMARY KEY,
    DName varchar(40) NOT NULL,
    Location varchar(10) NOT NULL,
);

CREATE TABLE Employee (
    EmpID int NOT NULL PRIMARY KEY,
	EName varchar(40) NOT NULL,
    Salary float NOT NULL,
    DeptNo int FOREIGN KEY REFERENCES Department(DeptNo)
);

INSERT INTO Department VALUES (101,'HR','Andheri');

INSERT INTO Employee VALUES (1,'Namrata',15000,102);