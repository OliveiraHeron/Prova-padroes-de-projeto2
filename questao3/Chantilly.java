package questao3;

public class Chantilly extends Complemento {
    public Chantilly(Bebida bebida) { super(bebida); }
    @Override protected String getNome() { return "Chantilly"; }
    @Override protected double getValor() { return 3.00; }
}
