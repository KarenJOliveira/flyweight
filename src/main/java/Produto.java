public class Produto {
    private String sku;
    private String nome;
    private double preco;

    public Produto(String sku, String nome, double preco) {
        this.sku = sku;
        this.nome = nome;
        this.preco = preco;
    }

    public String getSku() {
        return sku;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
