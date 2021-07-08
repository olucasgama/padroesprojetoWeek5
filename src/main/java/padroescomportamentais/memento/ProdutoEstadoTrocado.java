package padroescomportamentais.memento;

public class ProdutoEstadoTrocado implements ProdutoEstado {
    
    private ProdutoEstadoTrocado() {};
    private static ProdutoEstadoTrocado instance = new ProdutoEstadoTrocado();
    
    public static ProdutoEstadoTrocado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Trocado";
    }

}
