import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Pedido> pedidos = new ArrayList<>();

    public void criarPedido(String idPedido, String cliente, String sku, String nomeProduto, double preco, int quantidade) {
        Produto produto = ProdutoFactory.getProduto(sku, nomeProduto, preco);
        Pedido pedido = new Pedido(idPedido, cliente, produto, quantidade);
        pedidos.add(pedido);
    }

    public List<String> obterPedidos() {
        List<String> saida = new ArrayList<>();
        for (Pedido p : pedidos) {
            saida.add(p.obterPedido());
        }
        return saida;
    }
}
