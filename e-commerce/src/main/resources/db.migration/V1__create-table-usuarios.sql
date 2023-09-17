create table usuarios(
id serial primary key,
nome varchar(45) not null,
email varchar(45) not null,
ativo boolean
);