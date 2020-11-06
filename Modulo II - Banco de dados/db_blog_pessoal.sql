use blog_pessoal;
show tables;
select * from postagem;
select * from tb_tema;
insert into postagem (`date`,`texto`,`titulo`)
values ('2020-11-03 10:10:10.000','Estou Aprendendo','API Rest Spring');

insert into postagem (texto,titulo) values ('Testando','Titulo');

insert into postagem (id, ano, date, texto, titulo, tema_id)values (null, 2010, null, "Dúvida", "solicitações", 1);
insert into postagem (id, ano, date, texto, titulo, tema_id)values (null, 2011, null, "Preço", "solicitações", 1);
insert into postagem (id, ano, date, texto, titulo, tema_id) values (null, 2012, null, "Preço", "solicitações", 1);
insert into postagem (id, ano, date, texto, titulo, tema_id) values (null, 2013, null, "Preço", "solicitações", 2);
insert into postagem (id, ano, date, texto, titulo, tema_id)values (null, 2014, null, "Preço", "solicitações", 2);

insert into tb_tema values (default,"Notícias");

SELECT * FROM postagem WHERE ano > 2011;

select * from postagem where ano > 2011 ORDER BY ano DESC;

SELECT * FROM postagem WHERE ano > 2011 and ano <= 2013;

SELECT * FROM postagem ORDER BY ano;


Select day(data) from teste;
Select month(data) from teste;
Select year(data) from teste where year(data) < 2010;
Select day(data) from teste;

