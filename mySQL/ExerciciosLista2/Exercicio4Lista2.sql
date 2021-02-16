create database db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
tipo_carne varchar(255) not null,
marca varchar(255) not null,
corte varchar(255) not null,
primary key (id)
);

select * from tb_categoria;

create table tb_produto(
id bigint auto_increment,
nome_da_carne varchar(255) not null,
quantidade varchar(255) not null,
validade int not null,
preco decimal not null,
prod_id bigint,
primary key (id),
foreign key (prod_id) references tb_categoria (id)
);

select * from tb_produto;

insert into tb_categoria (tipo_carne,marca,corte) values ("Bovina","Friboi","Churrasco");
insert into tb_categoria (tipo_carne,marca,corte) values ("Suina","Sadia","Churrasco");
insert into tb_categoria (tipo_carne,marca,corte) values ("Ave","Friboi","Churrasco");
insert into tb_categoria (tipo_carne,marca,corte) values ("Bovina","Friboi","Peça");
insert into tb_categoria (tipo_carne,marca,corte) values ("Bovina","Sadia","Peça");

insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Picanha","2Kg",2023,85,1);
insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Costela de Porco","1Kg",2024,25,2);
insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Asinha","1Kg",2023,15,3);
insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Picanha","3Kg",2025,130,4);
insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Picanha","1Kg",2023,35,5);
insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Bisteca","1Kg",2024,18,2);
insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Alcatra","1Kg",2023,38,1);
insert into tb_produto (nome_da_carne,quantidade,validade,preco,prod_id) values ("Coxa","1Kg",2022,15,3);

select * from tb_produto where preco > 50;
select * from tb_produto where preco >= 3 and preco <= 60;
select * from tb_produto where nome_da_carne like "%C%";
select nome_da_carne,tipo_carne,marca,corte,preco,quantidade from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.prod_id;
select nome_da_carne,tipo_carne,corte from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.prod_id where prod_id = 1 or prod_id = 4 or prod_id = 5;