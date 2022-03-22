package main.Cliente;

public class ClienteContado extends Cliente  
{  
    protected Pedido creaPedido(double importe)  
    {  
        return new PedidoContado(importe);  
    }  
}