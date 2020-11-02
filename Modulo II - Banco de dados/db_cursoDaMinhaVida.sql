create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

drop table tb_produto;
create table tb_produto (
	 id_prod int auto_increment,
	 cursos varchar(30),
     professores varchar(30),
     qtdBolsas varchar(30),
     gratuito boolean,
     preco decimal(5,2),
     id_cursos int,
     primary key (id_prod),
     constraint fk_categoria foreign key (id_cursos) references tb_categoria (id_categoria)
);

insert into tb_produto (id_cursos,cursos,professores,qtdBolsas,gratuito, preco) values 
(1,'Curso de JAVA', 'Luiza',0,true, 0),
(2,'Curso de Jquery', 'Jessica',0,true, 0),
(3,'Curso de PHP', 'Guanabara',0,true, 0),
(4,'Curso de JavaScript', 'Felipe',0,false, 20.00),
(5,'Curso de Spring', 'Nuvem',0,true, 0),
(5,'Curso de Swift', 'Ramos',0,false, 35.00),
(5,'Curso de Github', 'Bóson Treinamentos',0,true, 0),
(1,'Curso de Docker', 'Loiane Groner',0,false, 75.00);

select * from tb_produto;

drop table tb_categoria;
create table tb_categoria(
	id_categoria int auto_increment,
    patrocinio varchar(30),
    disponivel boolean,
	primary key (id_categoria)
);

select * from tb_categoria;
insert into tb_categoria (patrocinio, disponivel) values 
('Generation Brasil',true),
('Google',true),
('Facebook',true),
('Microsoft',true),
('Digital House',true);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where cursos like '%JAV%';

select * from tb_produto inner join tb_categoria;

select * from tb_produto inner join tb_categoria where id_categoria like '%JAV%';


