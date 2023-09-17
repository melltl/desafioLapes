package desafio.cesupa.ecommerce.carrinho;

import desafio.cesupa.ecommerce.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {
    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho adicionarProdutoAoCarrinho(Produto produto) {
        Carrinho carrinho = new Carrinho();
        carrinho.setProduto(produto);
        return carrinhoRepository.save(carrinho);
    }
    public Carrinho finalizarCompra(Long idCarrinho) {
        Carrinho carrinho = carrinhoRepository.findById(idCarrinho).orElseThrow(() -> new RuntimeException("Carrinho não encontrado"));
        carrinho.setFinalizado(true);
        return carrinhoRepository.save(carrinho);
    }

}
