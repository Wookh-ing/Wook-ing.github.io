select * from my_db.restaurant, menu; -- cross 모든 경우의 수

select * from menu as a
left join restaurant as b on a.prime = b.prime;

select * from restaurant as a
right join menu as b on a.prime = b.prime; 

select * from restaurant as a
left outer join menu as b on a.prime = b.prime;

select * from restaurant as a
inner join menu as b on a.prime = b.prime; new_viewnew_view
-- inner 은 결합이 가능한 행들만 보여준다
-- left, right(outer) 왼쪽, 오른쪽거 무조건 다 나온다