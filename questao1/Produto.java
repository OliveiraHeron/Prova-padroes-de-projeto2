package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<Observador> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }

    public void adicionarObservador(Observador o) { observadores.add(o); }
    public void removerObservador(Observador o) { observadores.remove(o); }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        if (novaQuantidade == this.quantidade) {
            return; // RQ1.4: só comunica se mudou
        }
        this.quantidade = novaQuantidade;
        notificar();
    }

    private void notificar() {
        for (Observador o : new ArrayList<>(observadores)) {
            o.atualizar(nome, quantidade);
        }
    }
}
