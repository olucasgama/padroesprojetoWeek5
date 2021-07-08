package padroescomportamentais.memento;

public class ProdutoEstadoDevolvido implements ProdutoEstado {
    
    private ProdutoEstadoDevolvido() {};
    private static ProdutoEstadoDevolvido instance = new ProdutoEstadoDevolvido();
    
    public static ProdutoEstadoDevolvido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Devolvido";
    }

}
