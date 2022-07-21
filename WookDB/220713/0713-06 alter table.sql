-- 식당 정보 테이블
-- 상호명
-- 전화번호
-- 주소 등등
drop table restaurant;


create table restaurant (
	prime int primary key auto_increment,
	tradeName varchar(20) not null,
    tel varchar(20) not null,
    adress varchar(50) not null
);

desc restaurant;

insert into restaurant (tradeName, tel, adress) 
values ("대모골", "051-803-3109", "부산광역시 부산진구 부전로152번길 71"),
("도연정", "051-805-0071", "부산 부산진구 새싹로 16 ")
-- ("각방", "0507-1435-0268", "부산 부산진구 동천로107번길 12-5"),
-- ("교통부 돼지국밥", "051-808-1542", "부산 부산진구 새싹로8번길 16"),
-- ("월구떡볶이", "051-805-2953", "부산 부산진구 부전동 외환은행 뒷편");
;
select * from restaurant;
select * from restaurant where adress like "%부산진구%";

-- 메뉴 정보 테이블
-- 음식명
-- 가격
drop table menu;

create table menu (
	menuNum int primary key auto_increment,
	foodName varchar(30)  not null,
    price int not null
);

insert into menu (foodName, price) values
("고추장, 간장구이 정식 1인분", 7500),
("칼국수", 3000), ("짜장면", 3000), ("돈까스", 6500), ("소고기 해장국", 4500)
-- ("닭꼬치 덮밥", 9500), ("연어 덮밥", 11000), ("장어 덮밥", 12500),
-- ("돼지국밥", 7000), ("내장국밥", 7000), ("섞어국밥", 7000), ("순대국밥", 7000),
-- ("떡볶이", 3000), ("어묵", 500), ("김밥", 1500), ("튀김", 500), ("순대", 3000), ("라면", 3000);
;
select * from menu;

select * from menu limit 1 offset 0; -- 대모골
select * from menu limit 4 offset 1; -- 도연정
-- select * from menu limit 3 offset 5; -- 각방
-- select * from menu limit 4 offset 8; -- 교통부 돼지국밥
-- select * from menu limit 5 offset 12; -- 월구떡볶이

alter table menu add column prime int;

update menu
set prime = 2
where menuNum <> 1;

alter table menu add constraint foreign key (prime) references restaurant (prime);



