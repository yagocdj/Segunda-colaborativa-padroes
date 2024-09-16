package carta;

import enums.CorCartaTradicional;
import enums.Naipe;

public class CartaTradicional extends Carta {
    private Naipe naipe; // naipe da carta ("Hearts", "Diamonds", ...)

    public CartaTradicional(String face, Naipe naipe, CorCartaTradicional cor) {
        super(face, cor, 0);
        this.naipe = naipe;
    }

    public CartaTradicional() { }

    @Override
    public String toString() {
        return String.format("%6s", super.getFace()) + " de " + super.getCor().ansiCode() +
            naipe.getSymbol() + super.getCor().reset() + ", valor " + super.getValor();
    }

    @Override
    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String[] getAcoes() {
        throw new UnsupportedOperationException(
            "Operação não suportada para esse tipo de baralho."
        );
    }

    @Override
    public void setAcoes(String... acoes) {
        throw new UnsupportedOperationException(
            "Operação não suportada para esse tipo de baralho."
        );
    }

    @Override
    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

}
