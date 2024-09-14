package br.edu.ifpb.pps.baralho;

import br.edu.ifpb.pps.builder.CartaDirector;
import br.edu.ifpb.pps.builder.CartaUnoBuilder;
import br.edu.ifpb.pps.carta.CartaUno;

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