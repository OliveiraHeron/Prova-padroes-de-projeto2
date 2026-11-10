package questao3;

import java.util.Locale;

public class Main {
    private static final Locale BR = Locale.forLanguageTag("pt-BR");

    private static void imprimir(int numero, Bebida pedido) {
        System.out.println(String.format(BR, "Pedido %d: %s = R$ %.2f",
                numero, pedido.getDescricao(), pedido.getPreco()));
    }

    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Espresso());
        Bebida pedido2 = new Calda(new Chantilly(new Leite(new Cha())));
        Bebida pedido3 = new Leite(new Leite(new Chantilly(new Espresso()))); // Leite repetido

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
    }
}
