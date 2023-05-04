public class PedidoFacadeImpl implements PedidoFacade {
    private Pedidos pedidos;
    private Pagamento pagamento;

    public PedidoFacadeImpl(Pedidos pedidos, Pagamento pagamento) {
        this.pedidos = pedidos;
        this.pagamento = pagamento;
    }

    public Pedidos fazerPedido(Produto produto, int quantidade) {
            Pedidos pedido = pedidos.adicionarPedido(produto, quantidade);
            pagamento.efetuarPagamento(pedido);
            return pedido;

    }

    public void cancelarPedido(Pedidos pedido) {
        pedidos.cancelarPedido(pedido);
        pagamento.cancelarPagamento(pedido);
    }
}
