package desafio.cesupa.ecommerce.categoria;
import jakarta.validation.constraints.NotBlank;
public record DadosCadastroCategoria(
        @NotBlank
        String nome) {
}
