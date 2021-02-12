create database db_servico_rh_empresa

create table tab_funcionario(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
salario float not null,
cpf int not null,
ativo boolean,
primary key(id)
);

select * from tab_funcionarios;

insert into tab_funcionario (nome,idade,salario,cpf) values ("Marcos",27,5000,477887373);
insert into tab_funcionario (nome,idade,salario,cpf) values ("Sabalete",19,8000,343245234);
insert into tab_funcionario (nome,idade,salario,cpf) values ("Jean",27,1500,323665766);
insert into tab_funcionario (nome,idade,salario,cpf) values ("Athos",26,5000,345678987);
insert into tab_funcionario (nome,idade,salario,cpf) values ("Lucas",25,2000,234008676);

update tab_funcionario set salario = 1500 where id = 5;