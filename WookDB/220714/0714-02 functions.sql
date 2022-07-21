use hr;

select * from employees;

select rtrim('    a    ');
select ltrim('    a    ');
select trim('    a    ');


select lower('ABCDE');
select upper('abcde');

select reverse('qwer');

select concat('문자열', '결합', '함수');
select concat('결합', null, '값이 있으면?');

select char_length('문자열길이');

select replace('원본 문자열에서 변환합니다', '변환', 'replace');
select replace(1234, 1, 5);

select substring('employees', 5); -- 문자열, 자를 시작 위치
select substring('employees', 5, 2); -- 문자열, 자를 시작 위치, 개수
select substring('employees', -3); -- 음수일때 우측에서 부터 위치를 세어나감
select substring('employees', -3, 2);

select lpad("123", 5, '0');
select rpad("456", 5, '*');
select repeat('반복결합', 3);

select locate('d', 'abcdefg');
select locate('위치', '문자열의 위치를 찾는데 sql의 문자 순서는 1부터 시작');

-- '515.123.4567'
-- .을 기준으로 각각 잘라보기

select locate('.', '515.123.4567');
select substring('515.123.4567', 1, 3);
select substring('515.123.4567', 5, 3);
select substring('515.123.4567', 9, 4);

-- 직원 테이블 전화번호 앞자리 3자리를 그룹지어 분류해서 개수
select * from employees;
select subString(phone_number, 1, 3), count(*) from employees 
group by subString(phone_number, 1, 3); 

--
select rand();
select round(123.123, 2);
select floor(1.555);
select ceil(1.222);

select abs(-55);
select pow(2, 8);

-- 주사위 1~6 사이의 난수 생성
select round(rand(), 1);
select ceil(rand() * 6);