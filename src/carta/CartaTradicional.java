package carta;


// Classe Card representa uma carta de baralho.

import enums.Cor;

public class CartaTradicional extends Carta {
    private String naipe; // naipe da carta ("Hearts", "Diamonds", ...)

    public CartaTradicional(String face, String naipe, Cor cor) {
        super(face, cor, 0);
        this.naipe = naipe;
    }

    public String getNaipe() {
        return naipe;
    }

    public String toString() {
        return String.format("%6s", super.getFace()) + " de " + super.getCor().ansiCode() + naipe + Cor.RESET.ansiCode() + ", valor " + super.getValor();
    }

}
