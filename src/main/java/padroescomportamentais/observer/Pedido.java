package padroescomportamentais.observer;

import java.util.Observable;

public class Pedido extends Observable {

    private Integer numero;
    private String status;

    public Pedido(Integer numero, String status) {
        this.numero = numero;
        this.status = status;
    }

    public void setStatus () {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "seu pedido{" +
                "numero=" + numero +
                ", status='" + status + '\'' +
                '}';
    }
}
