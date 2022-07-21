select * from country
where name like '%korea%';

-- k로 끝나는
select * from country
where name like '%k';
-- k로 시작하는
select * from country
where name like 'k%';

-- 국가 이름이 'A'로 시작하고 'A'로 끝나는 국가 조회
select * from country
where name like 'A%A';

-- 국가 이름이 'A'로 시작하고 'A'로 끝나는 국가 조회 (6자)
select * from country
where name like 'A____A';

-- 국가명이 '~ria' 로 끝나는 국가 조회
select * from country
where name like '%ria';

-- Region 컬럼이 North ~ 로 시작하는 국가 조회
select * from country
where region like 'north%';

-- Region 컬럼에 A로 시작해서 a로 끝나는 명칭을 포함하지 않는 국가
select * from country
where region not like '%a%a' and region not like 'a%a%';