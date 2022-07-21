select * from books as a
left join persons as b on a.owner = b.personId;
select * from books;
select * from persons;

select a.*, b.firstName from books as a
left join persons as b on a.owner = b.personId;

select a.*, b.firstName from books as a
left join persons as b on a.owner = b.personId
where a.price >= 50000;

select * from persons;
select * from books;

