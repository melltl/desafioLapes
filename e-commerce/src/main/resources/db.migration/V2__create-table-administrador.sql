create table administrador(
id serial primary key,
nome varchar(45) not null,
email varchar(45) not null,
id_usuarios serial,
foreign key (id_usuarios) references usuarios(id)
);