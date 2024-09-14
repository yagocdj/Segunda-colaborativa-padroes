package builder;


import enums.Cor;
import enums.TipoCarta;

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