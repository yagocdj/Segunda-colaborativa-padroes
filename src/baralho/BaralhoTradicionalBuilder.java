package baralho;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {
    private BaralhoTradicional resultado;

    public BaralhoTradicionalBuilder() { }

    @Override
    public void redefinir() {
        this.resultado = new BaralhoTradicional();
    }

    @Override
    public void preencherBaralho() {

    }

    @Override
    public BaralhoTradicional obterResultado() {
        return this.resultado;
    }
}
