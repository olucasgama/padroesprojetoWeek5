package padroescomportamentais.memento;

public class ProdutoEstadoVendido implements ProdutoEstado {
    
    private ProdutoEstadoVendido() {};
    private static ProdutoEstadoVendido instance = new ProdutoEstadoVendido();
    
    public static ProdutoEstadoVendido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Vendido";
    }

}
