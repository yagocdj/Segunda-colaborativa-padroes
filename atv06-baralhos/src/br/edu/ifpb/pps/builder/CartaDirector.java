package br.edu.ifpb.pps.builder;

import br.edu.ifpb.pps.enums.Cor;
import br.edu.ifpb.pps.enums.TipoCarta;

public class CartaDirector {
    private CartaBuilder cartaBuilder;

    public CartaDirector(CartaBuilder cartaBuilder) {
        this.cartaBuilder = cartaBuilder;
    }

    public void makeCarta(TipoCarta tipoCarta, Cor cor, int valor, String face, String naipe) {
        cartaBuilder.reset();
        cartaBuilder.definirCor(cor);
        cartaBuilder.definirValor(valor);
        cartaBuilder.definirFace(face);

        if (tipoCarta == TipoCarta.TRADICIONAL) {
            ((CartaTradicionalBuilder) cartaBuilder).definirNaipe();
        } 
    }
}