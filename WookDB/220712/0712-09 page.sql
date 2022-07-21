총 행의 개수 239 행
한페이지에 10개씩 보여준다고
총 페이지 =? 24
1페이지를 보여주려면 몇개를 건너뛰고 몇개를 보여줘야함? 0 (페이지번호 -1) * 10


set @rowCount := 239;
set @pageNumber := 1;
set @pagePer := 10;
set @totalPage := @rowCount / @pagePer; -- 계산 

-- 239행을 가지는 country 테이블을 각 페이지별 행의 개수와 보고자 하는 
-- 페이지 번호를 정하면 해당 row들을 조회할 수 있는 select 문을 작성해보기

prepare stmt from 'select * from country limit ? offset ?';
execute stmt using @pagePer, @pageNumber;

