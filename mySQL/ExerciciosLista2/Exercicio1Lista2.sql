create database db_generation_game_online;

create table tb_class(
id bigint auto_increment,
nome_classe varchar(255) not null,
ataque int not null,
defesa int not null,
primary key(id)
);

select * from tb_class;

create table tb_personagem(
id bigint auto_increment,
nome_personagem varchar(255) not null,
habilidade varchar(255) not null,
velocidade_ataque int not null,
poder_fisico int not null,
poder_magico int not null,
cargo_id bigint not null,
primary key(id),
foreign key(cargo_id) references tb_class (id)
);

select * from tb_personagem;

insert into tb_class (nome_classe,ataque,defesa) values ("Mago",2500,500);
insert into tb_class (nome_classe,ataque,defesa) values ("Guerreiro",1500,1500);
insert into tb_class (nome_classe,ataque,defesa) values ("Guerreiro Magico",1750,1350);
insert into tb_class (nome_classe,ataque,defesa) values ("Curandeiro",1500,500);
insert into tb_class (nome_classe,ataque,defesa) values ("Arqueiro", 2100, 600);

insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Cloud","Slash",80,1300,200,2);
insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Aerith","Heal",40,1400,100,4);
insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Legolas","Charge",95,2000,100,5);
insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Yuffie","Vanish",110,1000,750,3);
insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Edea","Ultima",50,0,2500,1);
insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Vivi","Explosion",50,200,2300,1);
insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Squall","Gun Blade",70,750,750,2);
insert into tb_personagem (nome_personagem,habilidade,velocidade_ataque,poder_fisico,poder_magico,cargo_id) values ("Noctis","Realm Blades",90,1000,750,3);

select * from tb_personagem where poder_fisico >= 2000 or poder_magico >= 2000;
select nome_personagem,poder_fisico,poder_magico,nome_classe,ataque from tb_personagem inner join tb_class on tb_class.id = tb_personagem.cargo_id where ataque > 2000;
select nome_personagem,nome_classe,defesa from tb_personagem inner join tb_class on tb_class.id = tb_personagem.cargo_id where defesa >= 1000 and defesa <=2000;
select * from tb_personagem where nome_personagem like "%C%";
select nome_personagem,nome_classe from tb_personagem inner join tb_class on tb_class.id = tb_personagem.cargo_id where cargo_id = 3;