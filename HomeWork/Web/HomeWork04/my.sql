create database if not exists web_seminar04;
use web_seminar04;
drop table if exists groupmates;
create table groupmates (
	id int primary key auto_increment,
    name varchar(50) not null,
    age int not null,
    address varchar(100) not null
);

insert into groupmates (name, age, address) values 
	('Ivan', 20, 'Moscow'), 
    ('Oleg', 21, 'Orel'),
    ('Igor', 19, 'Taganrog'),
    ('Alex', 20, 'Tomsk'),
    ('Sergey', 19, 'Azov'),
    ('Daniil', 32, 'Moscow'),
    ('Ruslan', 21, 'Moscow'),
    ('Anna', 33, 'Adler');
    
select name from groupmates where address = 'Moscow' and (age >= 18 and age < 30);
