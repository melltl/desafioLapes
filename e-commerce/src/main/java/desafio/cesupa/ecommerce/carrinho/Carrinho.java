package desafio.cesupa.ecommerce.carrinho;

import desafio.cesupa.ecommerce.produto.Produto;
import desafio.cesupa.ecommerce.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "carrinho_compra")
@Entity(name = "Carrinho")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean finalizado = false;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;



}
