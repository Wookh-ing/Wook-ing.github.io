select * from employees;

desc employees;

-- MySql 날짜 : date
-- 시간 : time
-- 날짜 시간 : datetime / timestamp

select current_date();
select current_time();
select current_timestamp();

select date '2022-07-14';
select time '12:05:33';

-- hire_date 1987년 6월
select * from employees
where hire_date >= date '1987-06-01' and hire_date <= date '1987-06-30'; 
select * from employees
where hire_date between '1987/06/01' and '1987/06/30'; 

select date '1987-06-01' + 40;

select adddate('1987-06-01', 40);
select subdate('1987-06-01', 1);
select date_add('1987-06-01', interval 40 day);

select '1987-06-01' + interval 1 year;
select '1987-06-30' + interval 1 day;

select dayofweek('2022-07-14'); -- 1 일요일

select extract(year from '2022-07-14');
select extract(month from '2022-07-14');
select extract(day from '2022-07-14');
select extract(day from current_date());

select datediff(current_date(), '2022-06-13');

select str_to_date('2021/06/13', '%y/%m/%d');
select date_format(date '2021-06-13', '%y/%M/%d');

-- 17일에 고용된 직원의 목록
select * from employees
where extract(day from hire_date) = 17;

select * from employees
where HIRE_DATE like '%-17';

-- job_history 각 행별로 일한 '기간(일)' 조회

select *, datediff(end_date, start_date) from job_history;

select start_date, end_date, datediff(end_date, start_date)
 as inter from job_history;
 
 -- 자료형 숫자, 문자열, 날짜
select cast('2022-06-01' as date);
select cast('10' as time);
select cast('10' as double) + 5.5;

select convert(10, time);
select convert('10', double) + 5.5;



