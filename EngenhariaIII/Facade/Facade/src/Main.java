public class Main {
    public static void main(String[] args) {

        Pedidos pedidos = new Pedidos();
        Pagamento pagamentos = new Pagamento();
        PedidoFacadeImpl pedidoFacade = new PedidoFacadeImpl(pedidos, pagamentos);
        Produto prod1 = new Produto("Colar", 100);
        Produto prod2 = new Produto("Pulseira", 100);
        Produto prod3 = new Produto("Relógio", 100);

        var pedido1 = pedidoFacade.fazerPedido(prod1, 5);
        pedidoFacade.cancelarPedido(pedido1);
                ;

    }
}