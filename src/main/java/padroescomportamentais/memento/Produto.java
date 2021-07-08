package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private ProdutoEstado estado;
    private List<ProdutoEstado> memento = new ArrayList<ProdutoEstado>();

    public void setEstado(ProdutoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public ProdutoEstado getEstado() {
        return this.estado;
    }

    public List<ProdutoEstado> getEstados() {
        return this.memento;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }
}
