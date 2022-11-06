
-- Creating database 
create database sda_course;

-- Switch database
use sda_course;

create table students(
	studentID int auto_increment,
    name varchar(55) not null,
    lastname varchar(55) not null,
    primary key(studentID)
);
    
use javaee18;

-- Delete database 
drop database sda_course;

-- DATABASE JOINS

select * from country;
drop table if exists country;


-- CREATE country table
CREATE TABLE country(
	id int NOT NULL AUTO_INCREMENT,
    name varchar(45),
    PRIMARY KEY (id),
    UNIQUE(name)
);

INSERT INTO country (name) VALUES('USA');
INSERT INTO country (name) VALUES('Canada');
INSERT INTO country (name) VALUES('Australia');
INSERT INTO country (name) VALUES('France');

SELECT * FROM country ORDER BY id ASC;

create table states (
	stateID int not null auto_increment,
    countryID int,
    state varchar(55),
    primary key(stateID)
);

insert into states(countryID, state) values (1, 'California');
insert into states(countryID, state) values (1,'New York');

insert into states(countryID, state) values (2,'Ontario');

insert into states(countryID, state) values (3,'Tasmania');

insert into states(countryID, state) values (5, 'Bavaria');
insert into states(countryID, state) values (5,'Bremen');

select * from states;

-- INNER join
select * from country inner join states on country.id = states.countryID;

-- left join

select*from country left join states on country.id = states.countryID order by country.id; 

-- right jpin
select*from country right join states on country.id = states.countryID order by country.id; 

select country.name, states.state from country right join states on country.id = states.countryID group by state;

-- uninon
select*from country left join states on country.id = states.countryID 
union
select*from country right join states on country.id = states.countryID ;















