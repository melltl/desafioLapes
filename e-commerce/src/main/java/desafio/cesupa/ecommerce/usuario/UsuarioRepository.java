package desafio.cesupa.ecommerce.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Page<Usuario> findAllByAtivoTrue(Pageable paginacao);

}
