import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LojaTest {
    @Test
    void deveRetornarPedidos() {
        Loja loja = new Loja();
        loja.criarPedido("P001", "Maria", "SKU-123", "Geladeira X", 1500.0, 1);
        loja.criarPedido("P002", "Joao", "SKU-123", "Geladeira X", 1500.0, 2);
        loja.criarPedido("P003", "Ana", "SKU-999", "Microondas Y", 300.0, 1);

        List<String> saida = Arrays.asList(
                "Pedido{id='P001', cliente='Maria', produto='Geladeira X', sku='SKU-123', precoUnit=1500.0, quantidade=1}",
                "Pedido{id='P002', cliente='Joao', produto='Geladeira X', sku='SKU-123', precoUnit=1500.0, quantidade=2}",
                "Pedido{id='P003', cliente='Ana', produto='Microondas Y', sku='SKU-999', precoUnit=300.0, quantidade=1}"
        );

        assertEquals(saida, loja.obterPedidos());
    }

    @Test
    void deveRetornarTotalProdutos() {
        Loja loja = new Loja();
        loja.criarPedido("P001", "Maria", "SKU-123", "Geladeira X", 1500.0, 1);
        loja.criarPedido("P002", "Joao", "SKU-123", "Geladeira X", 1500.0, 2);
        loja.criarPedido("P003", "Ana", "SKU-999", "Microondas Y", 300.0, 1);

        assertEquals(2, ProdutoFactory.getTotalProdutos());
    }
}
