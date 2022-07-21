select * from country;
select * from country limit 5;

-- 인구가 가장많은 국가 1개의 국가 조회하기

select * from country
order by population desc
limit 1;

-- 면적순 탑 5
select * from country
order by SurfaceArea desc
limit 5;

-- continent 가 'asia' 인 국가들 중 면적이 좁은 순으로 10개 국가
select * from country
where Continent = 'asia'
order by SurfaceArea 
limit 10;

-- region 이 '~Africa' 로 끝나는 국가들 중 독립년도(IndepYear)가 가장 최근인 10개 국가
select * from country 
where region like '%africa'
order by IndepYear desc
limit 10;

-- 면적당 인구비율(population / SurfaceArea) 탑 10 국가 조회
select * from country
order by population / SurfaceArea desc
limit 10;

-- (GNP - GNPOld 변화량) 최상위 10
select * from country
order by GNP - GNPOld desc
limit 10;