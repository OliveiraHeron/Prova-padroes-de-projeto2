package questao1;

import java.util.ArrayList;
import java.util.List;


public class Auditoria implements Observador {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = "Produto '" + nomeProduto + "' agora com " + novaQuantidade + " unidades";
        registros.add(registro);
        System.out.println("[AUDITORIA] " + registro);
    }

    public List<String> getRegistros() { return registros; }
}
