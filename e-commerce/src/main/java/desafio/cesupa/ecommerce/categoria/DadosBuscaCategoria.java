package desafio.cesupa.ecommerce.categoria;

public record DadosBuscaCategoria(Long id, String nome) {
    public DadosBuscaCategoria(Categoria categoria){
        this(categoria.getId(), categoria.getNome());


    }


}
