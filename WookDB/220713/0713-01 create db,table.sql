create database my_db;

show databases;

use my_db;

show tables;

-- 사람 테이블
create table persons (
-- 열1 이름 문자열
	name varchar(10),
-- 열2 나이 정수
    age int
);

desc persons;

select * from persons;

insert into persons (name, age) values ("홍길동", 22);
-- 행 추가
-- '브루스 리', 30살
-- '스티븐 킹', 40살
insert into persons (name, age) values ("브루스 리", 30);
insert into persons (name, age) values ("스티븐 킹", 40);

-- '철수', 20살
-- '철수', 30살
-- '철수', 40살
insert into persons (name, age) values ("철수", 20), ("철수", 30), ("철수", 40);
delete from persons;

drop table persons;

-- 책 테이블
-- 제목 : 문자열
-- 가격 : 정수

create table books (
	title varchar (20),
    price int
);
desc books;

insert into books(title, price) values ("파워자바", 25000)
, ("하늘과 바람과 별과 시", 15000), ("꽃을 보듯 너를 본다", 12000);

select * from books;

-- char(5)
-- 고정길이
-- varchar(5)
-- 가변길이

create table testChar (
	fixLength char(5)
    , varLength varchar(5)
);
insert into testChar (fixLength, varLength) values ('A', 'A');

select char_length(fixLength), char_length(varLength) from testChar;

-- 빈칸 제거

select rtrim('A            ');
select ltrim('            A');
select bookstrim('a b');
