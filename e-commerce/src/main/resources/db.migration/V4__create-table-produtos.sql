create table produtos(
id serial primary key,
nome varchar(45) not null,
preco float not null,
id_categoria int,
foreign key (id_categoria) references categoria(id)
);