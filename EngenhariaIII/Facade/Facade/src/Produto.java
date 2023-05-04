public class Produto {
    private String nome;
    private int preco;
    public Produto(String name, int price){
            nome = name;
            preco = price;
    }

    public int getPreco(){
        return this.preco;
    };
    public String getNome(){
        return this.nome;
    }

}
