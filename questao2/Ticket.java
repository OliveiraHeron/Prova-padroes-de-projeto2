package questao2;


public class Ticket {
    private final String placa;
    private final int minutos;
    private EstrategiaTarifa estrategia;

    public Ticket(String placa, int minutos, EstrategiaTarifa estrategia) {
        this.placa = placa;
        this.minutos = minutos;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaTarifa estrategia) { this.estrategia = estrategia; }
    public String getPlaca() { return placa; }
    public int getMinutos() { return minutos; }
    public String getPerfil() { return estrategia.getNome(); }

    public double calcularValor() {
        return estrategia.calcular(minutos);
    }
}
