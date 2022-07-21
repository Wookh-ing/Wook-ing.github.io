-- hr 부서 (departments) 테이블 모든 행과 열 조회
use hr;
select * from departments;

-- 부서 명이 'IT%'로 시작하는 부서들 조회
select * from departments where department_name like 'IT%';

-- 60, 210, 230
-- 직원 테이블
select * from employees where department_id in (
	-- 서브쿼리
	select department_id from departments where department_name like 'IT%'
);

-- 연봉 내림차순 정렬.
-- 연봉 상위 10명.
-- 연봉을 오름차순으로 조회.
select * from employees order by salary desc;

-- 서브쿼리로 조회후 별명으로 조회
select * from (
	select * from employees order by salary desc limit 10
) as a
order by salary asc;

select (select 1 + 1),2,3,4;

-- David Austin 의 연봉과 같은 연봉을 받는 직원들 조회
select * from employees where First_Name = 'david' and Last_Name = 'Austin';

select * from employees where salary = (
	select salary from employees where First_Name = 'david' and Last_Name = 'Austin'
);
