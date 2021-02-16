create database db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
nome_categoria varchar(255) not null,
marca varchar(255) not null,
tipo varchar(255) not null,
primary key (id)
);

select * from tb_categoria;

create table tb_remedio(
id bigint auto_increment,
nome_remedio varchar(255) not null,
quantidade varchar(255) not null,
validade int not null,
preco decimal not null,
produto_id bigint,
primary key (id),
foreign key (produto_id) references tb_categoria (id)
);

select * from tb_remedio;

insert into tb_categoria (nome_categoria,marca,tipo) values ("Para dor de cabeça","Bayer","Comprimido");
insert into tb_categoria (nome_categoria,marca,tipo) values ("Anticoncepcional","Adoless","Comprimido");
insert into tb_categoria (nome_categoria,marca,tipo) values ("Para dor muscular","Generico","Spray");
insert into tb_categoria (nome_categoria,marca,tipo) values ("Para Inflamações","Bayer","Liquido");
insert into tb_categoria (nome_categoria,marca,tipo) values ("Para cortes","Generico","Liquido");


insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Dorflex","1 Cartela",2022,2.5,1);
insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Adoless","1 Cartela",2023,50,2);
insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Gelol","1 spray",2022,30,3);
insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Metiolate","500ml",2022,70,5);
insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Amoxilina","400ml",2024,47,4);
insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Tylenol","1 Cartela",2025,10,1);
insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Advil","1 Cartela",2022,16,1);
insert into tb_remedio (nome_remedio,quantidade,validade,preco,produto_id) values ("Nebacetin","1 bisnaga",2022,2.99,5);

select * from tb_remedio where preco > 50;
select * from tb_remedio where preco >= 3 and preco <= 60;
select * from tb_remedio where nome_remedio like "%b%";
select nome_remedio,nome_categoria,marca,quantidade,tipo,preco,validade from tb_remedio inner join tb_categoria on tb_categoria.id = tb_remedio.produto_id;
select nome_remedio,nome_categoria,tipo from tb_remedio inner join tb_categoria on tb_categoria.id = tb_remedio.produto_id where produto_id = 1 or produto_id = 2;