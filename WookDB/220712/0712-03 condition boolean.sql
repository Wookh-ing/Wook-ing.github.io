select * from country where name = 'south korea' or name = 'japan' or name = 'china';

-- 긍정
select * from country where name in('south korea', 'japan', 'china');
-- 부정
select * from country where name not in('south korea', 'japan', 'china');
-- 긍정
select * from country where Population between 40000000 and 50000000;
-- 부정
select * from country where Population not between 40000000 and 50000000;

-- continent 컬럼 값이 north america, europe, aisa 를 제외한 국가들 중
-- gnp 값이 100 이상 1000 이하인 국가 목록 조회하기

select * from country where continent not in ('north america', 'europe', 'asia')
and gnp between 100 and 1000;

select null;
select * from country where indepyear != ('null');
-- SQL 언어로 하지만 DATABASE 를 서비스하는 업체는 엄청 많기때문에
-- 각 업체별로 받아들이는 언어의 형식이 다르다. '사투리' 라고 한다.
select * from country where indepyear = ('null'); -- 이건 안나온다
select * from country where indepyear is null;
select * from country where indepyear is not null;