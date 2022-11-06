CREATE TABLE human(
	id int NOT NULL AUTO_INCREMENT,
    name varchar (50),
    age int,
    PRIMARY KEY (id)
);

INSERT INTO human (name, age) VALUES ('Joseph', 15);
INSERT INTO human (name, age) VALUES ('Dwinght Schrute', 43);
INSERT INTO human (name, age) VALUES ('Kanye West', 43);

SELECT * FROM human;

drop table if exists users;

CREATE TABLE users (
    username varchar(50),
    password varchar(50),
    fullname varchar(50),
    email varchar(50),
    PRIMARY KEY (username)
);


INSERT INTO users(username, password, fullname, email) VALUES('cool123','IloveJava', 'Ben Rock', 'ben@rock.com');
INSERT INTO users(username, password, fullname, email) VALUES('car','Lamborgini', 'Andrea Car', 'andrea@gmail.com');
INSERT INTO users(username, password, fullname, email) VALUES('qwerty','QWERTY', 'Qwerty Ytrewq', 'qwerty@yahoo.com');

SELECT * FROM USERS;

