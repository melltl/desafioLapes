package desafio.cesupa.ecommerce.produto;

import desafio.cesupa.ecommerce.carrinho.Carrinho;
import desafio.cesupa.ecommerce.categoria.Categoria;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="produtos")
@Entity(name="Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Float preco;

    private Boolean ativo;
    @OneToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    private Carrinho carrinho;
    public Produto(DadosCadastroProduto dados) {

        this.ativo=true;
        this.nome = dados.nome();
        this.preco=dados.preco();


    }

    public void excluir() {
        this.ativo = false;
    }
}
