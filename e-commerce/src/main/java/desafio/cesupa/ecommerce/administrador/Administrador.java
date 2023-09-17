package desafio.cesupa.ecommerce.administrador;

import desafio.cesupa.ecommerce.produto.Produto;
import desafio.cesupa.ecommerce.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Table(name = "administrador")
@Entity(name = "Administrador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    public Administrador(DadosCadastroAdministrador dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.usuario=dados.usuario();

    }
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


}
