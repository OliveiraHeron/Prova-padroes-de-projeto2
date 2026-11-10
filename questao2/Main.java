package questao2;

import java.util.Locale;

public class Main {
    private static final Locale BR = Locale.forLanguageTag("pt-BR");

    private static void imprimir(Ticket t) {
        System.out.println(String.format(BR, "Placa %s | %d min | %-10s | R$ %.2f",
                t.getPlaca(), t.getMinutos(), t.getPerfil(), t.calcularValor()));
    }

    public static void main(String[] args) {
        int permanencia = 100;

        System.out.println("--- Mesmo tempo (" + permanencia + " min) em cada perfil ---");
        imprimir(new Ticket("ABC-1234", permanencia, new Rotativo()));
        imprimir(new Ticket("DEF-5678", permanencia, new Mensalista()));
        imprimir(new Ticket("GHI-9012", permanencia, new Conveniado()));

        System.out.println("\n--- Troca de perfil no mesmo tíquete ---");
        Ticket ticket = new Ticket("XYZ-0001", permanencia, new Rotativo());
        imprimir(ticket);
        ticket.setEstrategia(new Conveniado());
        imprimir(ticket);
        ticket.setEstrategia(new Mensalista());
        imprimir(ticket);
    }
}
