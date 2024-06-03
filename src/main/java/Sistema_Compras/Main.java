package Sistema_Compras;

public class Main {
    public static void main(String[] args) {
        // Criar produtos
        Produto produto1 = new Produto("Feijão", 9.50, 2);
        Produto produto2 = new Produto("Arroz", 5.00, 3);
        Produto produto3 = new Produto("Sal", 2.00, 1);

        // Criar carrinho e adicionar produtos
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Listar produtos e mostrar total
        carrinho.listarProdutos();
        System.out.printf("Total: R$ %.2f%n", carrinho.calcularTotal());
    }
}
