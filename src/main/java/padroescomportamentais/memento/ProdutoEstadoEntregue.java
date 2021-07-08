package padroescomportamentais.memento;

public class ProdutoEstadoEntregue implements ProdutoEstado {
    
    private ProdutoEstadoEntregue() { };
    private static ProdutoEstadoEntregue instance = new ProdutoEstadoEntregue();

    public static ProdutoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }

}
