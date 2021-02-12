create database db_registro_escolar;

create table tab_alunos(
id bigint auto_increment,
nome varchar (255),
idade int not null,
melhorMateria varchar (255),
nota int,
primary key (id)
);

select * from tab_alunos;

insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Marcos",27,"Matematica",9);
insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Mayara",22,"Filosofia", 10);
insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Jean",27,"PHP",5);
insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Milton",23,"Eletronica",6);
insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Maria",22,"Historia",8);
insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Fernando",19,"Algoritimos",10);
insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Claudio",33,"S.O",6);
insert into tab_alunos (nome,idade,melhorMateria,nota) values ("Paola",19,"POO",3);

select * from tab_alunos where nota > 7;

select * from tab_alunos where nota < 7;

update tab_alunos set nota = 8 where id = 3;

