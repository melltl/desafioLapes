package desafio.cesupa.ecommerce.usuario;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

@Table(name= "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Boolean ativo;

    public Usuario(DadosCadastroUsuario dados) {
        this.ativo = true;
        this.nome=dados.nome();
        this.email=dados.email();
    }

    public void excluir() {
        this.ativo=false;
    }
}
