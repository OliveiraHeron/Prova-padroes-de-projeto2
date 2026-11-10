package questao2;

public class Rotativo implements EstrategiaTarifa {
    public static final double VALOR_HORA = 8.00;

    @Override
    public double calcular(int minutos) {
        int horasIniciadas = (int) Math.ceil(minutos / 60.0);
        return horasIniciadas * VALOR_HORA;
    }

    @Override
    public String getNome() { return "Rotativo"; }
}
