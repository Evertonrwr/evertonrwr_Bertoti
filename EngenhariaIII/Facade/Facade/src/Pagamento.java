public class Pagamento {
    public void efetuarPagamento(Pedidos pedido) {
        System.out.println("Pagamento de" + pedido.produto.getPreco()* pedido.quantidade + " do produto " + pedido.produto.getNome()+ " realizado com sucesso!");
    }
    public void cancelarPagamento(Pedidos pedido) {
        System.out.println("Cancelamento de pagamento de " + pedido.produto.getPreco()* pedido.quantidade + " do produto " + pedido.produto.getNome()+ " realizado com sucesso!");

    }
}
