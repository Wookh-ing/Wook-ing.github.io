create table persons (
	personId int primary key auto_increment,
    -- 이름
    firstName varchar(10) not null,
    -- 성
    lastName varchar(10) not null,
    -- 나이
    age int not null,
    -- email
    email varchar(50) not null unique 
);

insert into persons (firstName, lastName, age, email) 
values ("길동", "홍", 20, "길동@길동.net");

insert into persons (firstName, lastName, age, email) 
values ("길동", "고", 42, "killdong@길동.net");

select * from persons;

-- 테이블 이름
-- 각 열 (이름, 타입, 제약)
-- key 열