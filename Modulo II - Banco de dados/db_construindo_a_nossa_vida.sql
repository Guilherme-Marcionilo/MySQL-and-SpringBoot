create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

drop table tb_categoria;
create table tb_categoria (
	id_categoria int auto_increment,
    nome_categoria varchar(30),
    disponivel boolean,
	novas_entregas DATE,    
    primary key (id_categoria)
);
select * from tb_categoria;
insert into tb_categoria (nome_categoria,disponivel,novas_entregas) values 
('Hidráulica',true, '2020-10-31'),
('Elétrica',false, '2020-11-2'),
('Alvenaria',false, '2020-12-31'),
('Alvenaria',true, '2020-11-8'),
('Elétrica',true, '2020-11-2'),
('Hidráulica',false, '2020-12-31'),
('Elétrica',true, '2020-11-5'),
('Hidráulica',true, '2020-11-10');

drop table tb_produto;
create table tb_produto (
	 id_prod int auto_increment,
	 nome_prod varchar(30),
     preco decimal(5,2),
	 qtdProd int,
	 marca varchar(30),
     categoria int,
     primary key (id_prod),
     constraint fk_produto foreign key (categoria) references tb_categoria (id_categoria)
);
select * from tb_produto;
insert into tb_produto (categoria,nome_prod, preco, qtdProd, marca) values 
(1,'Cimento',25.00,7,'Votoran'),
(1,'Areia',60.00,13,'Viapol'),
(2,'Concreto',15.00,20,'Cauê'),
(3,'Pedra Brita',85.00,120,'Votoran'),
(4,'Aço',125.00,300,'Viapol'),
(5,'Cal',355.00,9,'Cauê'),
(2,'Argamassa',605.00,10,'Viapol'),
(4,'Aditivos',135.00,5,'Cauê');



select * from tb_produto where preco > 50.00;

select * from tb_produto where preco between 3 and 60.00;

select * from tb_produto where nome_prod like 'CI%';

select * from tb_produto inner join tb_categoria;

select * from tb_produto inner join tb_categoria where id_prod = id_categoria;





 
















