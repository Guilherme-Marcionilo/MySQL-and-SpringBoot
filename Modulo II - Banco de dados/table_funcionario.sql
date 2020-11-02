create database RH;
use RH;

drop table funcionarios;

CREATE table funcionarios(
id int primary key auto_increment,
nome varchar(30),
sexo enum('M','F'),
salario decimal(10,3),
peso decimal(5,2)

);

insert into funcionarios (nome,sexo,salario,peso) values
('Guilherme','M','1.000','50.2'),
('Junior','M','12.000','60.2');

select * from funcionarios;

select * from funcionarios where salario > 2.000;

select * from funcionarios where salario < 2.000;

update funcionarios
set nome = 'Novo Nome', sexo = 'F'
where id = '1';



