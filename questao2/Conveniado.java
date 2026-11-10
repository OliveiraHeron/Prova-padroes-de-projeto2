package questao2;

public class Conveniado implements EstrategiaTarifa {
    public static final int MINUTOS_GRATIS = 30;
    public static final double VALOR_HORA = 8.00;
    public static final double DESCONTO_PERCENTUAL = 25.0;

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = minutos - MINUTOS_GRATIS;
        if (minutosCobrados <= 0) {
            return 0.0;
        }
        int horasIniciadas = (int) Math.ceil(minutosCobrados / 60.0);
        double valorCheio = horasIniciadas * VALOR_HORA;
        return valorCheio * (1 - DESCONTO_PERCENTUAL / 100.0);
    }

    @Override
    public String getNome() { return "Conveniado"; }
}
