package baralho;

import builder.CartaDirector;
import builder.CartaUnoBuilder;
import carta.CartaUno;
import enums.TipoCarta;

public class BaralhoUno extends Baralho<CartaUno> {

    private static final int NUMBER_OF_CARDS = 113;

    public BaralhoUno() {
        cartaBuilder = new CartaUnoBuilder();
        cartaDirector = new CartaDirector(cartaBuilder);
        //cartaDirector.makeCarta(TipoCarta.UNO);
    }

    public void shuffle() {

    }

    public String toString() {
        return "";
    }
}