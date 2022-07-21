select name, 
	case when LifeExpectancy is null then 0.0
    else LifeExpectancy end as life
	from country;

-- 직원 이름(이름 + 성) 결합시킨 full name
-- 전화번호가 011 로 시작하는 경우 '개인전화', 그 외의 경우 '내선번호'라고 별명은 '분류' 조회
select concat(first_name, ' ', last_name) as 'full name',
	case when Phone_Number like '011%' then '개인전화'
		else '내선 번호'
        end as '분류'
from employees;

select case when 10 > 5 then '왼쪽이 오른쪽보다 큽니다'
	else '왼쪽이 오른쪽보다 작거나 같습니다'
    end;
    
select case when 10 > 5 then '왼쪽'
			when 10 = 5 then '같음'
            when 10 < 5 then '오른쪽'
            end as '비교';
            
select ifnull(null, '대체값');

-- 값이 3개. 1번째 값이 null 이면 2번째값, 2번째 값도 null이면 3번째 값
select ifnull(ifnull('첫번째 값', '두번째 값'), '세번째 값');
select coalesce('첫', '두', '세');

select nullif('A', 'B');
            


