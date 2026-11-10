package questao1;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 10);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("--- Estoque 10 -> 8 ---");
        produto.setQuantidade(8);
        System.out.println("--- Mesma quantidade (8): nada deve acontecer ---");
        produto.setQuantidade(8);
        System.out.println("--- Estoque 8 -> 4 ---");
        produto.setQuantidade(4);
        System.out.println("--- Estoque 4 -> 0 ---");
        produto.setQuantidade(0);
        System.out.println("--- Estoque 0 -> 6 (reposição) ---");
        produto.setQuantidade(6);

        System.out.println("\n>>> Removendo a área de Compras <<<");
        produto.removerObservador(compras);

        System.out.println("--- Estoque 6 -> 3 (Compras não deve alertar) ---");
        produto.setQuantidade(3);
        System.out.println("--- Estoque 3 -> 0 ---");
        produto.setQuantidade(0);
        System.out.println("--- Estoque 0 -> 20 ---");
        produto.setQuantidade(20);

        System.out.println("\nTotal de registros na auditoria: " + auditoria.getRegistros().size());
    }
}
