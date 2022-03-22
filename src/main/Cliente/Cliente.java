package main.Cliente;

import java.util.*; 

public abstract class Cliente  
{  
    protected List<Pedido> pedidos =  
        new ArrayList<Pedido>();  
  
    protected abstract Pedido creaPedido(double importe);  
  
    public void nuevoPedido(double importe)  
    {  
        Pedido pedido = this.creaPedido(importe);  
        if (pedido.valida())  
        {  
            pedido.paga();  
            pedidos.add(pedido);  
        }  
    }  
}