package desafio.cesupa.ecommerce.administrador;

import desafio.cesupa.ecommerce.usuario.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroAdministrador(@NotBlank
                                         String nome,
                                         @NotBlank
                                         @Email
                                         String email,
                                         @NotNull
                                         Usuario usuario) {

}
