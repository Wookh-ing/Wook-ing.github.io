-- 각 직원들의 이름과 연봉, 평균연봉과 차(평균연봉 - 연봉)를 조회해보세요.
select * from employees;
select avg(salary) from employees;
select First_Name, Last_Name, Salary , salary - 6461.682243 from employees;
select First_Name, Last_Name, Salary ,Salary - (select avg(salary) from employees) as '평균 연봉 차액' from employees;

-- 최고 연봉직원과 최저 연봉직원들의 이름을 조회해보세요.
-- 최고 연봉
select First_Name, Last_Name, salary from employees where salary = (select max(salary) from employees);
-- 최저 연봉
select First_Name, Last_Name, salary from employees where salary = (select min(salary) from employees);
-- 최고 or 최저
select First_Name, Last_Name, salary from employees 
where salary = (select max(salary) from employees) or salary = (select min(salary) from employees);
select * from employees order by salary;

-- 평균연봉보다 높게 받는 직원 조회
select First_Name, Last_Name, salary,(select avg(salary) from employees) as 'AvgSalary' from employees 
where salary > (select avg(salary) from employees);

-- 부서명이 IT로 시작하는 직원들의 수(카운트)를 조회해보세요.
select count(*) from employees where JOB_ID like '%IT%';
select * from employees where JOB_ID like '%IT%';

-- Douglas grant의 이메일을 'dog@naver.com' 으로 변경해보세요.
select * from employees;

alter table employees add column EMAIL varchar(20);
update employees
set EMAIL = 'dog@naver.com'
where FIRST_NAME = 'Douglas' and LAST_NAME = 'Grant';

-- Ellen Abel 과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬해서 조회
select * from employees where DEPARTMENT_ID = 80 order by salary desc;

-- 부서명이 IT로 시작하는 부서에서 근무하는 최고연봉자보다 높은 연봉을 받는 직원 목록을 연봉 오름차순으로 조회
select * from employees where salary > (select max(salary) from employees where JOB_ID like 'IT%') order by salary asc;
select * from employees where JOB_ID like 'IT%';

-- 자기가 속한 부서의 평균보다 많이 받는 직원
select * from employees where 


