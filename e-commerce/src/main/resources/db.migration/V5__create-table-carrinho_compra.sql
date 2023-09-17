create table carrinho_compra(
carrinho_id serial primary key,
usuario_id serial,
produto_id serial,
quantidade int,
foreign key (usuario_id) references usuarios(id),
foreign key (produto_id) references produtos(id)
);
