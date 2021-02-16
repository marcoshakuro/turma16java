create database db_curso_Da_Minha_Vida;

create table tb_categoria(
id bigint auto_increment,
nome varchar(255) not null,
area varchar(255) not null,
primary key(id)
);

select * from tb_categoria;

create table tb_curso(
id bigint auto_increment,
nome_curso varchar(255) not null,
carga_horaria int not null,
nota_minima decimal not null,
cargo_id bigint not null,
primary key(id),
foreign key(cargo_id) references tb_categoria (id)
);

select * from tb_curso;

insert into tb_categoria (nome,area) values ("Historia","Humanas");
insert into tb_categoria (nome,area) values ("Engenharia","Exatas");
insert into tb_categoria (nome,area) values ("Ingles","Humanas");
insert into tb_categoria (nome,area) values ("Matematica","Exatas");
insert into tb_categoria (nome,area) values ("Filosofia","Humanas");

insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("TO_BE",180,8,3);
insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("Produção",580,8,2);
insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("Derivadas",200,7,4);
insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("Freud",250,7,5);
insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("Guerras Mundiais",140,9,1);
insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("Simple Present",100,8,3);
insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("Trigonometria",150,6,4);
insert into tb_curso (nome_curso,carga_horaria,nota_minima,cargo_id) values ("Socratis",100,6,5);

select * from tb_curso where nota_minima > 7;
select * from tb_curso where nota_minima > 5 and nota_minima <= 7;
select nome_curso,nome,carga_horaria,area from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.cargo_id;
select * from tb_categoria inner join tb_curso on tb_categoria.id = tb_curso.cargo_id where cargo_id = 1;