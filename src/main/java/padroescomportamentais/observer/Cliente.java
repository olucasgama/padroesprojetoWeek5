package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimoStatus;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimoStatus() {
        return ultimoStatus;
    }

    public void efetuar (Pedido pedido) {
        pedido.addObserver(this);
    }

    public void update(Observable pedido, Object arg) {
        this.ultimoStatus = this.nome + ", " + pedido.toString();
    }
}
