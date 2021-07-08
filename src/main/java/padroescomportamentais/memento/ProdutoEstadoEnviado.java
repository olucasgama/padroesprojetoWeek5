package padroescomportamentais.memento;

public class ProdutoEstadoEnviado implements ProdutoEstado {

    private ProdutoEstadoEnviado() { };
    private static ProdutoEstadoEnviado instance = new ProdutoEstadoEnviado();

    public static ProdutoEstadoEnviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Enviado";
    }

}
