package observer;

import org.junit.jupiter.api.Test;
import padroescomportamentais.observer.Cliente;
import padroescomportamentais.observer.Pedido;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    void notificaCliente() {
        Pedido pedido = new Pedido(22, "Preparando");
        Cliente cliente = new Cliente("Aline");
        cliente.efetuar(pedido);
        pedido.setStatus();
        assertEquals("Aline, seu pedido{numero=22, status='Preparando'}", cliente.getUltimoStatus());
    }

    @Test
    void notificaClientes() {
        Pedido pedido = new Pedido(22, "Preparando");
        Pedido pedido1 = new Pedido(23, "Entregue");
        Cliente cliente = new Cliente("Aline");
        Cliente cliente1 = new Cliente("Danilo");
        cliente.efetuar(pedido);
        cliente1.efetuar(pedido1);
        pedido.setStatus();
        pedido1.setStatus();
        assertEquals("Aline, seu pedido{numero=22, status='Preparando'}", cliente.getUltimoStatus());
        assertEquals("Danilo, seu pedido{numero=23, status='Entregue'}", cliente1.getUltimoStatus());
    }

    @Test
    void naoNotificaCLiente(){
        Pedido pedido = new Pedido(22, "Preparando");
        Cliente cliente = new Cliente("Aline");
        pedido.setStatus();
        assertEquals(null, cliente.getUltimoStatus());
    }
}
