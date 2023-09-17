package desafio.cesupa.ecommerce.categoria;


import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    @Query("SELECT categoria.nome FROM Categoria categoria")
    List<String> findNomesDasCategorias();

    CategoriaRepository findByNome(String nome);

}
