package desafio.cesupa.ecommerce.produto;

import desafio.cesupa.ecommerce.categoria.Categoria;

public record DadosListagemProduto(Long id, String nome, Float preco, Categoria categoria) {

   public DadosListagemProduto(Produto produto){

       this(produto.getId(), produto.getNome(), produto.getPreco(),produto.getCategoria());
   }
}
