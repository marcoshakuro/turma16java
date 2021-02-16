create database db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
nome_categoria varchar(255) not null,
tamanho varchar(255) not null,
tipo varchar(255) not null,
primary key (id)
);

select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
nome_pizza varchar(255) not null,
sabor varchar(255) not null,
quantidade int not null,
borda_recheada varchar(255) not null,
preco decimal not null,
complemento_id bigint,
primary key (id),
foreign key (complemento_id) references tb_categoria (id)
);

select * from tb_pizza;

insert into tb_categoria (nome_categoria,tamanho,tipo) values ("Tradicional","Normal","Salgada");
insert into tb_categoria (nome_categoria,tamanho,tipo) values ("Tradicional","Pequena","Salgada");
insert into tb_categoria (nome_categoria,tamanho,tipo) values ("Artesanal","Normal","Doce");
insert into tb_categoria (nome_categoria,tamanho,tipo) values ("Artesanal","Pequena","Doce");
insert into tb_categoria (nome_categoria,tamanho,tipo) values ("Meia-a-Meio","Pequena","Salgada");
insert into tb_categoria (nome_categoria,tamanho,tipo) values ("Meio-a-Meio","Pequena","Doce");

insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Marguerita","Queijo e Tomate",1,"Sim",60.00,1);
insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Calabresa","Calabresa e Cebola",3,"Sim",60.00,1);
insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Nordestina","Carne seca e cebola",2,"Não",35.00,2);
insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Veneza/2 Queijos","Milho e Catupiri/Queijo e Catupiri",1,"Sim",35.00,5);
insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Marguerita/Calabresa","Queijo e Tomate/Calabresa e Cebola",2,"Não",30.00,5);
insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Brigadeiro/Prestigio","Chocolate/Coco e Doce de Leite",3,"Sim",40.00,6);
insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Banana","Banana e Canela",4,"Sim",65.00,3);
insert into tb_pizza (nome_pizza,sabor,quantidade,borda_recheada,preco,complemento_id) values ("Sensação","Chocolate e Morango ",3,"Sim",25.00,4);

select * from tb_pizza where preco > 45;
select * from tb_pizza where preco >= 29 and preco <= 60;
select * from tb_pizza where nome_pizza like "%C%";
select nome_pizza,sabor,preco,nome_categoria,tamanho,tipo from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.complemento_id;
select nome_pizza,sabor,tipo from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.complemento_id where complemento_id = 3 or complemento_id = 4 or complemento_id = 6;