/* Multi line
comment */

-- 2- and space - Single line comment

-- Creatint table

CREATE TABLE Presidents(
	PersonID int,
    Country varchar(50),
    LastName varchar(100),
    FirstName varchar(100), 
    Address varchar(255),
    City varchar(50),
    PRIMARY KEY(PersonID)
);


-- Inserting records into tabele

INSERT INTO Presidents(PersonID, Country, LastName, FirstName, Address, City)
VALUES (1000, 'USA', 'Trump', 'Donald', 'House is 515 North County Road, Palm Beach, Florida 33480', 'Florida');

INSERT INTO Presidents VALUES(1001, 'USA', 'Obama', 'Barack', '2500 W. Golf Road Hoffman Estates, IL 60169-1114', 'Florida' );

INSERT INTO Presidents(PersonID, Country, LastName, FirstName)VALUES(1002,'USA', 'Baiden', 'Joe');

INSERT INTO Presidents(PersonID, Country, LastName, FirstName)VALUES(1003,'USA', 'George W.', 'Bush');

-- View table records

SELECT * FROM presidents;

-- Delete table
DROP TABLE Presidents;

SELECT LastName, City FROM presidents;

-- WHERE

SELECT LastName, City FROM presidents WHERE City = 'Florida';

-- AND

SELECT FirstName, Country, City FROM presidents WHERE City = 'Florida' AND LastName = 'Trump';

-- OR

SELECT * FROM presidents WHERE LastName = 'Obama' OR FirstName = 'Joe';

-- NOT

SELECT * FROM presidents WHERE NOT LastName = 'Obama';

-- ORDER

SELECT * FROM presidents ORDER BY LastName;

-- ORDER desc

SELECT * FROM presidents ORDER BY LastName DESC;

-- ORDER by more then one colum

SELECT * FROM presidents ORDER BY City, LastName;

-- DISTINCT  returns only unique values

SELECT DISTINCT Country FROM presidents;

-- Count how many records are in the table

SELECT COUNT(*) FROM presidents;

-- Count how many unique countries is there in the table presidents

SELECT COUNT(DISTINCT Country) FROM presidents;

-- Update data

UPDATE Presidents SET City = 'New York' WHERE PersonID = 1002;

-- UPDATE Presidents SET City = 'New Florida' Where City = 'Florida';

-- DELETE RECORDS  

DELETE FROM presidents WHERE PersonID = 1003;

-- DELETE TABLE 

DROP TABLE presidents;







