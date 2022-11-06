

-- NOT NULL
-- Makes sure that the colum value will not empty

-- AUTO_INCREMENT
-- Increments column value automaticly

DROP TABLE IF EXISTS users;

SELECT * FROM users;

create table users (
	userID int not null auto_increment,
    username varchar(45) not null,
    password varchar(45) not null,
    fullname varchar(45) not null, 
    email varchar(55),
    primary key(userID),
    UNIQUE(username)
);

insert into users(username,password,fullname,email) values('trump','mexico','Donald Trump','mega@gmail.com');

-- NO default value = mandarory column
INSERT INTO users (username, password) VALUES ('karlis', '1234'); 

INSERT INTO users ( username, password, fullname) VALUES ('bush','qwerty', 'Georg W. Bush');

INSERT INTO users(email,fullname, password, username) VALUE ( 'obama@gmail.com', 'Barack Obama', '123','obama');

-- Modify existing column
-- DEFAULT value

ALTER TABLE users
MODIFY COLUMN email varchar(55) DEFAULT 'default@default.com';

INSERT INTO users( username, password, fullname) VALUES ('biden', '12334','Joe Biden');

-- ADD COLUMN
ALTER TABLE users
ADD netWorth DECIMAL;

-- DELETE COLUMN
ALTER TABLE users
DROP COLUMN netWorth;

-- ADD COLUMN
ALTER TABLE users
ADD netWorth DECIMAL(7,2);

ALTER TABLE users 
MODIFY COLUMN netWorth DECIMAL (10,2);

SELECT * FROM users;

--  Challange 
-- add different salary for every users in table
-- trumpwall = 20344.45
-- bush = 100430.34 AND set email to bush@gmail.com
-- obama = 23424.5
-- biden = 45678.93 AND set email to joe@gmail.com

UPDATE users SET netWorth = '20344.45' WHERE username ='trump';
UPDATE users SET netWorth = '23424.5' WHERE username ='obama';

UPDATE users SET netWorth = '1004.34', email ='bush@gmail.com' WHERE username ='bush';
UPDATE users SET netWorth = '14567.93', email ='joe@gmail.com' WHERE username ='biden';

DROP TABLE users;

-- ADD COLUMN
ALTER TABLE users
ADD country varchar(55);

UPDATE users SET country='USA' WHERE username = 'trump';
UPDATE users SET country='Estonia' WHERE username = 'bush';
UPDATE users SET country='Latvia' WHERE username = 'obama';
UPDATE users SET country='Canada' WHERE username = 'biden';

SELECT * FROM users;

-- MIN & MAX 
SELECT MIN(netWorth) FROM users;

SELECT MAX(netWorth) AS LArgestNetWorth FROM users;

-- COUNT 
SELECT COUNT(*) FROM users;

-- AVG
SELECT AVG(netWorth) AS AverageNetWorth FROM users;

-- SUM
select sum(netWorth) As SumNetWorth from users;

-- LIKE 
select * from users where username like 'b%';

select * from email where username like '%gmail.com';

-- IN 

select * from users where country IN('USA','Latvia');

select * from users where country = 'USA' OR country = 'Latvia';


-- list all country names 

select country from users;

select * from users where country in(select country from users) ;

-- Create country table
create table country(
id int not null auto_increment,
name varchar(45),
primary key (id),
unique(name)
);

insert into country (name) values('USA');
insert into country (name) values('Canada');
insert into country (name) values('Australia');
insert into country (name) values('France');

select * from country;

-- filter all users whos country value can see in country table list
select * from users where country in(select name from country) ;

select * from users where netWorth > 20000;

select * from users where country not in(select name from country);

