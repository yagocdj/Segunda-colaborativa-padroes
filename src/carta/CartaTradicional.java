package carta;

import enums.Cor;
import enums.Naipe;

public class CartaTradicional extends Carta {
    private Naipe naipe; // naipe da carta ("Hearts", "Diamonds", ...)

    public CartaTradicional(String face, Naipe naipe, Cor cor) {
        super(face, cor, 0);
        this.naipe = naipe;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String toString() {
        return String.format("%6s", super.getFace()) + " de " + super.getCor().ansiCode() + naipe.getSymbol() + Cor.RESET.ansiCode() + ", valor " + super.getValor();
    }

}
