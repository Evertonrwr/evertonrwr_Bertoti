import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    public Produto produto;
    public int quantidade;

    public Pedidos adicionarPedido(Produto produto, int quantidade) {
       Pedidos pedido = new Pedidos();
       pedido.produto = produto;
       pedido.quantidade = quantidade;
        return pedido;
    }
    public void cancelarPedido(Pedidos pedido) {
        System.out.println("Pedido do produto "+ pedido.produto.getNome() + " cancelado com sucesso");
    }


}
