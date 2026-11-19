import java.util.HashMap;
import java.util.Map;

public class ProdutoFactory {
    private static Map<String, Produto> produtos = new HashMap<>();

    // Retorna um produto compartilhado por SKU
    public static Produto getProduto(String sku, String nome, double preco) {
        Produto produto = produtos.get(sku);
        if (produto == null) {
            produto = new Produto(sku, nome, preco);
            produtos.put(sku, produto);
        }
        return produto;
    }

    public static int getTotalProdutos() {
        return produtos.size();
    }
}
