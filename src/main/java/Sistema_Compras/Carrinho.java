package Sistema_Compras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    public List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto no carrinho.");
        } else {
            System.out.println("Nome Valor Unit Qtd Sub-total");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubtotal();
        }
        return total;
    }
}
