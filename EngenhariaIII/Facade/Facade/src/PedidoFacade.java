public interface PedidoFacade {
    public Pedidos fazerPedido(Produto produto, int quantidade);
    public void cancelarPedido(Pedidos pedido);
}
