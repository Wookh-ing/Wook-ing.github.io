desc books;

select * from books;

alter table books change column title title varchar(30) not null;

insert into books (title) values ('디폴터값확인');

select * from books;

-- create table myPractice (
-- 	colName1 varchar(50) default '39838o'
-- );

-- select * from myPractice;