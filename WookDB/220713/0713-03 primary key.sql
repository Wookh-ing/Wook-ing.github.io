drop database my_db;

create database my_db;

use my_db;

create table students (
	number int primary key,
    name varchar(10),
    age int,
    score double
);

-- 주요 키 (PRIMARY KEY) : NOT NULL, UNIQUE

desc students;

insert into students (number, name, age, score) 
values (1234, "길동", 20, 3.3);
insert into students (number, name, age, score) 
values (1235, "둘리", 30, 4.4);
insert into students (number, name, age, score) 
values (1236, "길동", 20, 3.3);

select * from students;