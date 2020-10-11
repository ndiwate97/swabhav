CREATE TABLE College (
    CollegeId int NOT NULL PRIMARY KEY,
    Name varchar(40) NOT NULL,
    Location varchar(10) NOT NULL,
);

CREATE TABLE Students (
    StudID int NOT NULL PRIMARY KEY,
	StudName varchar(40) NOT NULL,
    ContactNo int NOT NULL,
	Address varchar(40) NOT NULL,
    CollegeId int FOREIGN KEY REFERENCES College(CollegeId)
);
