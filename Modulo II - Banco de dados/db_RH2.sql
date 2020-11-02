create database db_RH2;
use db_RH2;

drop table tb_cargo;
create table tb_cargo (
	id_cargo bigint auto_increment,
    cargo varchar(30),
    experiencia_prof boolean,
    primary key (id_cargo)    
);

select * from tb_cargo;

insert into tb_cargo values 
(default,'Java Junior',true),
(default,'UX Designer',false),
(default,'Java Junior',false),
(default,'You Dev Money',true),
(default,'Linux',true)
;

drop table tb_funcionarios;
create table tb_funcionarios (
	id_fun bigint auto_increment,
    nome_fun varchar (30),
    sexo enum ('M','F'),
    idade int,
    nacionalidade varchar(30) default 'Chinês',
    salario decimal(10,2),
    cargo bigint,
    primary key (id_fun),
    constraint fk_cargo foreign key (cargo) references tb_cargo (id_cargo)    
);

insert into tb_funcionarios values
(default,'Carlos','M',12,'Brasileiro', 12000.20,4),
(default,'Cleiton','M',default,26,12000.63,3),
(default,'Carlos','M',default,42,12000.23,2),
(default,'Vitão','M',82,'Australiano',12000.21,1),
(default,'Luiz','M',20,'Brasileiro',12000.20,2),
(default,'Pablo','M',35,'Japonês',100.20,5),
(default,'Carla','M',17,'Japonês',1000.20,5),
(default,'Maicon','M',18,'Japonês',600.20,1),
(default,'Disney','M',19,'Brasileiro',9000.20,2),
(default,'Marco','M',27,'Australiano',700.20,3),
(default,'Kênia','M',23,'Brasileiro',20000.20,3),
(default,'Yasmin','M',90,'Brasileiro',80000.20,3),
(default,'Mickey','M',15,'Tailândes',20.12,3),
(default,'Carlos','M','13','Mexicano',1200.20,4)
;

select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios where salario between 1000 and 2000;

select * from tb_funcionarios where nome_fun like 'C%';

#tb_funcionarios.nome_fun,tb_cargo.cargo,experiencia_prof

select * from tb_funcionarios inner join tb_cargo where tb_funcionarios.cargo = tb_cargo.id_cargo;
 
select * from tb_funcionarios inner join tb_cargo;

select * from tb_funcionarios,tb_cargo;

select tb_funcionarios.nome_fun,tb_cargo.cargo from tb_funcionarios inner join tb_cargo where tb_funcionarios.cargo = tb_cargo.id_cargo;
