--creating table
CREATE TABLE Student (
    RollNo int NOT NULL PRIMARY KEY,
    Name varchar(40) NOT NULL,
    Cgpa float,
);

--inserting single row
INSERT INTO Student VALUES (1,'Namrata',7.6);

--inserting multiple rows
INSERT INTO Student VALUES (2,'Tejashree',7.6),(3,'Pawan',7.6), (4,'Yash',7.7), (5,'Gargi',9.6);

--adding column
ALTER TABLE Student
ADD location varchar(20);

--adding check constraint
ALTER TABLE Student
ADD CHECK (cgpa>5.0);

INSERT INTO Student VALUES (6,'Error',4.6, 'errorloc');

--not null constarint
ALTER TABLE Student
ALTER COLUMN cgpa float NOT NULL;

--update all cgpa by .5
UPDATE Student
SET Cgpa = (Cgpa+0.5);

