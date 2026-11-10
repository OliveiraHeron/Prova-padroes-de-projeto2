package questao2;

public class Mensalista implements EstrategiaTarifa {
    public static final double VALOR_FIXO = 150.00;

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }

    @Override
    public String getNome() { return "Mensalista"; }
}
