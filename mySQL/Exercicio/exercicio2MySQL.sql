create database db_e_commerce;

create table tab_produto(
id bigint auto_increment,
nome varchar(255) not null,
codigo int not null,
preco float not null,
quantidade int not null,
ativo boolean,
primary key (id)
);

select * from tab_produto;

insert into tab_produto (nome,codigo,preco,quantidade) values ("Mesa",2245,600,10);
insert into tab_produto (nome,codigo,preco,quantidade) values ("Armario",3398,1000,5);
insert into tab_produto (nome,codigo,preco,quantidade) values ("Televisao",235, 1500,15);
insert into tab_produto (nome,codigo,preco,quantidade) values ("Computador",845,8000,4);
insert into tab_produto (nome,codigo,preco,quantidade) values ("Cadeira",3455,450,40);
insert into tab_produto (nome,codigo,preco,quantidade) values ("Teclado",498,200,60);
insert into tab_produto (nome,codigo,preco,quantidade) values ("Mouse",3115,150,80);
insert into tab_produto (nome,codigo,preco,quantidade) values ("HeadSet",1155,280,60);

select * from tab_produto where preco > 500;
select * from tab_produto where preco < 500;

update tab_produto set preco = 2300 where id = 2;