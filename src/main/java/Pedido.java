public class Pedido {
    private String idPedido;
    private String cliente;
    private Produto produto; // flyweight
    private int quantidade;

    public Pedido(String idPedido, String cliente, Produto produto, int quantidade) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String obterPedido() {
        return "Pedido{" +
                "id='" + idPedido + '\'' +
                ", cliente='" + cliente + '\'' +
                ", produto='" + produto.getNome() + '\'' +
                ", sku='" + produto.getSku() + '\'' +
                ", precoUnit=" + produto.getPreco() +
                ", quantidade=" + quantidade +
                '}';
    }
}
