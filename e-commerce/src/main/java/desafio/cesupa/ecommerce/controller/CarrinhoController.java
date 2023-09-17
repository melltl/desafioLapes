package desafio.cesupa.ecommerce.controller;

import desafio.cesupa.ecommerce.carrinho.*;
import desafio.cesupa.ecommerce.compra.Compra;
import desafio.cesupa.ecommerce.compra.CompraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import desafio.cesupa.ecommerce.produto.*;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("carrinho")
public class CarrinhoController {
    @Autowired
    private CarrinhoRepository repository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping("/{id}")
    public Carrinho adicionarProdutoAoCarrinho(@PathVariable Long id) {
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return carrinhoService.adicionarProdutoAoCarrinho(produto);
    }
    @PostMapping("/finalizar/{idCarrinho}")
    public Carrinho finalizarCompra(@PathVariable Long idCarrinho) {
        return carrinhoService.finalizarCompra(idCarrinho);
    }
}
