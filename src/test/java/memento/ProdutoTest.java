package memento;

import org.junit.jupiter.api.Test;
import padroescomportamentais.memento.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    void armazenaEstados() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        assertEquals(2, produto.getEstados().size());
    }

    @Test
    void retornaPrimeiroEstado() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        produto.restauraEstado(0);
        assertEquals(ProdutoEstadoEnviado.getInstance(), produto.getEstado());
    }

    @Test
    void retornaUltimoEstado() {
        Produto produto = new Produto();
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        produto.setEstado(ProdutoEstadoTrocado.getInstance());
        produto.setEstado(ProdutoEstadoDevolvido.getInstance());
        produto.restauraEstado(3);
        assertEquals(ProdutoEstadoTrocado.getInstance(), produto.getEstado());
    }

    @Test
    void retornaExcecao() {
        try {
            Produto produto = new Produto();
            produto.restauraEstado(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
