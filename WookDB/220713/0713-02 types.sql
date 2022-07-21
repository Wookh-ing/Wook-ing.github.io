-- 학생
-- 이름 : 가변길이 문자열(10자)
-- 나이 : 정수
-- 학점 : 실수

create table students (
	name varchar(10),
    age int,
    score double
);

desc students;

insert into students (name, age, score) values ("길동", 20, 3.3);
insert into students (name, age, score) values ("둘라", 20.5, 3);
insert into students (name, age, score) values ("둘라", 20.4, 3);

select * from students;

insert into students (name, age, score) values ("길동", 21, 2.6);

delete from students where name = '둘라';
