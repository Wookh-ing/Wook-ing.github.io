create table books (
	bookId int primary key auto_increment,
	title varchar(30),
    price int
);

drop table books;

desc books;

insert into books (title, price) values 
("책1", 2000), ("책2", 3000), ("중복", 2500), ("중복", 3000);

select * from books;

insert into books (title, price) values ("새로운 이름", 3500);

delete from books where bookId = 3;





