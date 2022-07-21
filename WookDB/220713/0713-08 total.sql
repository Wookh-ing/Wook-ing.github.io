-- 집계 함수

select * from employees;

select count(*) from employees;

-- 전화번호가 515~~~ 로 시작하는 직원을 조회하는 쿼리문
select * from employees where PHONE_NUMBER like '515%';
-- 전화번호가 515~~ 로 시작하는 직원의 수를 조회하는 쿼리문
select count(*) from employees where PHONE_NUMBER like '515%';

-- 합
select sum(SALARY) from employees;

-- 평균
select avg(salary) from employees;

-- 최대
select max(salary) from employees;

-- 최소
select min(salary) from employees;

-- 최대연봉과 최소연봉의 차를 구해보자
select max(salary) - min(salary) from employees;