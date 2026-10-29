package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteEconomico() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteEconomico(10.0f);
        assertEquals(50.0f, pedido.getFrete());
    }

    @Test
    void deveCalcularFreteExpresso() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteExpresso(10.0f);
        assertEquals(100.0f, pedido.getFrete());
    }

    @Test
    void deveCalcularFreteAgendado() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteAgendado(10.0f);
        assertEquals(70.0f, pedido.getFrete());
    }

    @Test
    void deveCalcularFreteGratis() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteGratis(10.0f);
        assertEquals(0.0f, pedido.getFrete());
    }

    @Test
    void deveCalcularFreteRetirada() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteRetirada(10.0f);
        assertEquals(0.0f, pedido.getFrete());
    }

}
