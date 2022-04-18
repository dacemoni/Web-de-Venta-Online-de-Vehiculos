package main.Cliente;

import main.Pedido.Pedido;
import main.Pedido.PedidoCredito;

public class ClienteCredito extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}