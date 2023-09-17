package desafio.cesupa.ecommerce.controller;

import desafio.cesupa.ecommerce.categoria.Categoria;
import desafio.cesupa.ecommerce.categoria.CategoriaRepository;
import desafio.cesupa.ecommerce.categoria.DadosBuscaCategoria;
import desafio.cesupa.ecommerce.categoria.DadosCadastroCategoria;
import desafio.cesupa.ecommerce.usuario.DadosDetalhamentoUsuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar (@RequestBody @Valid DadosCadastroCategoria dados, UriComponentsBuilder uriBuilder){
        var categoria = new Categoria(dados);
        repository.save(categoria);

        var uri = uriBuilder.path("/categoria/{id}").buildAndExpand(categoria.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosBuscaCategoria(categoria));
    }
    @GetMapping("/{id}")
    public ResponseEntity listar(@PathVariable Long id){
        var categoria=repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosBuscaCategoria(categoria));
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id) {
        var categoria= repository.getReferenceById(id);
        categoria.excluir();

        return ResponseEntity.noContent().build();
    }



}
