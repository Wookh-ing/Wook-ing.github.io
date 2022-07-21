select * from hr.employees;

/*
	부서 -- (employees.department_id -참-조-> departments.deaprtment_id)
	직책 -- (employees.job_id -참-조-> employees.employee_id)
	매니저 -- (departments.MANAGER_ID -참-조-> employees.employee_id)
    위치 -- (departments.id.location_idlocations
    
	1. 모든 부서의 부서명과 관리자 의 이름 조회
    2. 부서명이 IT로 시작하는 부서에서 일하는 직원들의 이름과 부서명 조회.
    3. 모든 직원들의 이름과 직책(JOB_TITLE) 조회job_history
    4. 직원의 해당 직책의 jobs테이블에 책정된 최대연봉(MAX_SALARY)을 초과한 연봉을 받는 직원이름, 현재연봉, 최대연봉 조회
    5. 부서중의 (COUNTRY_ID)가 'US'인 부서에 근무하는countries 직원명과 부서명.
*/
select * from departments;

select a.*, first_name, last_name from departments as a
left join employees as b on a.manager_id = b.EMPLOYEE_ID;

select department_name, first_name, last_name from departments as a
left join employees as b on a.department_id = b.DEPARTMENT_ID
where DEPARTMENT_NAME like 'IT%';

select * from jobs;
select JOB_TITLE, first_name, last_name from employees as a
left join jobs as b on a.JOB_ID = b.JOB_ID;

-- 직원의 해당 직책의 jobs테이블에 책정된 최대연봉(MAX_SALARY)을 초과한 연봉을 받는 직원이름, 현재연봉, 최대연봉 조회
select * from jobs;


select first_name, last_name, salary, max_salary from employees as a
left join jobs as b on a.job_id = b.job_id
where a.SALARY >= b.MAX_SALARY;




select * from countries;
select * from employees;
select * from departments;
select * from locations;
-- departments & employees -> department_id
-- departments & locations -> location_id
-- locations & countries -> counrty_id

select a.DEPARTMENT_NAME, first_name, last_name from departments as a
inner join employees as b on a.DEPARTMENT_ID = b.DEPARTMENT_ID 
inner join locations as c on a.LOCATION_ID = c.LOCATION_ID
inner join countries as d on c.COUNTRY_ID = d.COUNTRY_ID
where d.COUNTRY_ID = 'US';

