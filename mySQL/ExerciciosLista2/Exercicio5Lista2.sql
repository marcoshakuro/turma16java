create database db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
nome varchar(255) not null,
setor varchar(255) not null,
primary key (id)
);

select * from tb_categoria;

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
quantidade varchar(255) not null,
preco decimal not null,
prod_id bigint,
primary key (id),
foreign key (prod_id) references tb_categoria (id)
);

select * from tb_produto;

insert into tb_categoria (nome,setor) values ("Materias Contrução","Setor 1");
insert into tb_categoria (nome,setor) values ("Pintura","Setor 2");
insert into tb_categoria (nome,setor) values ("Jadim","Setor 3");
insert into tb_categoria (nome,setor) values ("Ferramentas","Setor 4");
insert into tb_categoria (nome,setor) values ("Hidraulico","Setor 5");

insert into tb_produto (nome,quantidade,preco,prod_id) values ("Torneira","10",45,5);
insert into tb_produto (nome,quantidade,preco,prod_id) values ("Mangueira","10",25,5);
insert into tb_produto (nome,quantidade,preco,prod_id) values ("Pá","10",10,3);
insert into tb_produto (nome,quantidade,preco,prod_id) values ("Pincel P","10",1.5,2);
insert into tb_produto (nome,quantidade,preco,prod_id) values ("Makita","5",250,4);
insert into tb_produto (nome,quantidade,preco,prod_id) values ("Cimento","10",50,1);
insert into tb_produto (nome,quantidade,preco,prod_id) values ("Martelo","10",35,4);
insert into tb_produto (nome,quantidade,preco,prod_id) values ("Rejunte","10",25,1);

select * from tb_produto where preco > 50 ;
select * from tb_produto where preco > 3 and preco < 60;
select * from tb_produto where nome like "%C%";
select p.nome,p.quantidade,p.preco,c.setor from tb_produto p inner join tb_categoria c on c.id = p.prod_id;
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.prod_id where prod_id = 5;