package main.Cliente;

import main.Pedido.Pedido;
import main.Pedido.PedidoContado;

public class ClienteContado extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}