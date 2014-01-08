create database teste_rede;

use teste_rede;



create table pessoa(
id int auto_increment, 
nome varchar(100),
telefone char(15),
constraint pk_pessoa primary key pessoa(id)
);

insert into pessoa(nome, telefone) values ('Wilton Aureliano','(11)1111-1111');
insert into pessoa(nome, telefone) values ('Junior Oliveira','(22)2222-2222');
insert into pessoa(nome, telefone) values ('Neide Lima','(33)3333-3333');
insert into pessoa(nome, telefone) values ('Alex Wilton','(44)4444-4444');
insert into pessoa(nome, telefone) values ('Aline Mysna','(55)5555-5555');
insert into pessoa(nome, telefone) values ('Amanda Miller','(66)6666-6666');

select * from pessoa;
select min(id) from pessoa;

select * from fornecedor;