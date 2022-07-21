-- code, name, population 별명 지어주기
select code, name, population from country;
select code as '코드', name as '이름', population as '인구' from country;

-- 위으 조회 + surfacearea (별명 : 면적) 컬럼을 추가로 조회
select code as '코드', name as '이름', population as '인구', surfacearea as '면적' 
, 15 + 15 as '계산결과' from country;


-- surfacearea 가 50,000 이하이면서 population이 10,000,000 이상인 국가의
-- 인구 밀도를 조회하세요
select code as '코드', name as '이름', population as '인구', surfacearea as '면적' 
, round(population / surfacearea, 1) as '인구밀도'
from country
order by 인구밀도 desc;
-- where surfacearea <= 50000 and population >= 10000000;

-- 아시아 대륙 국가들의 인구 순으로(내림차순) 조회
select *
	from country
	where continent = 'asia'
    order by population desc;
    
-- LifeExpectancy (기대수명) 을 오름차순으로 조회 (null 값을 제외한 행)
select * from country
where LifeExpectancy is not null
order by LifeExpectancy asc;

-- 국가의 이름과 인구와 gnp, gnpold (gnpold - gnp 차를 구해서 "변화량") 조회
select name, population, gnp, gnpold from country;

select name, Population, GNP, GNPOld, GNPOld- GNP as 'GNP 변화량'
from country
where gnp is not null and gnpold is not null
order by `GNP 변화량`;

-- 대륙 순으로 정렬해서 조회

select * from country order by Continent, Population;

-- GovernmentForm 오름차순, GNP의 내림차순 정렬
select * from country order by GovernmentForm, GNP desc;
