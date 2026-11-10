package questao3;

/** Decorator base: envolve uma Bebida e acrescenta nome e preço. */
public abstract class Complemento implements Bebida {
    private final Bebida bebida;

    protected Complemento(Bebida bebida) { this.bebida = bebida; }

    protected abstract String getNome();
    protected abstract double getValor();

    @Override
    public String getDescricao() { return bebida.getDescricao() + " + " + getNome(); }

    @Override
    public double getPreco() { return bebida.getPreco() + getValor(); }
}
