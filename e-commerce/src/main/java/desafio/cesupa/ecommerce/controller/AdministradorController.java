package desafio.cesupa.ecommerce.controller;

import desafio.cesupa.ecommerce.administrador.Administrador;
import desafio.cesupa.ecommerce.administrador.AdministradorRepository;
import desafio.cesupa.ecommerce.administrador.DadosCadastroAdministrador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("administrador")
public class AdministradorController {

    @Autowired
    private AdministradorRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroAdministrador dados){
        repository.save(new Administrador(dados));
    }

}
