-- SELECT 보고싶은거 FROM 테이블 이름
SELECT * FROM country;

SELECT * FROM city;

SELECT Name, Population FROM country;

DESC country;

-- country 테이블 Code 열과 GNP 열을 조회해보세요.

SELECT Code, GNP FROM country;

-- 특정 행(row)보기 = WHERE

SELECT * FROM country WHERE Name = 'South Korea';

-- 국가명이 'Japan' 인 행의 모든 컬럼 조회
SELECT * FROM country WHERE Name = 'Japan';

-- 국가명이 'China' 인 행의 모든 컬럼 조회
SELECT * FROM country WHERE Name = 'China';

-- Continent 값이 'Asia' 인 행 조회하기alter

SELECT * FROM country WHERE Continent = 'Asia';
select * from country where continent = 'asia';

select * from country where name = 'south korea' or name = 'japan' or name = 'china';

-- Population(인구) 컬럼 값이 40,000,000 이상인 국가의 모든 컬럼을 조회

select * from country where population >= 40000000;

-- Population(인구) 컬럼 값이 40,000,000 이상이고 50,000,000 이하인 국가의 모든 컬럼을 조회

select * from country where population <= 50000000 and Population >= 40000000;

-- Continent 'Asia' 를 제외한 국가 목록 조회
desc country;

select * from country where continent != 'asia';