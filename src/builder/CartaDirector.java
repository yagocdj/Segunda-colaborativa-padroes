package builder;


import enums.Cor;
import enums.TipoBaralho;

public class CartaDirector {
    private CartaBuilder cartaBuilder;

    public CartaDirector(CartaBuilder cartaBuilder) {
        this.cartaBuilder = cartaBuilder;
    }

    public void makeCarta(TipoBaralho tipoBaralho, Cor cor, int valor, String face, String naipe) {
        cartaBuilder.reset();
        cartaBuilder.definirCor(cor);
        cartaBuilder.definirValor(valor);
        cartaBuilder.definirFace(face);

        if (tipoBaralho == TipoBaralho.TRADICIONAL) {
            ((CartaTradicionalBuilder) cartaBuilder).definirNaipe();
        } 
    }
}