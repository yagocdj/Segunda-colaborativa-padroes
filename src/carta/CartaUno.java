package carta;

import enums.Cor;

public class CartaUno extends Carta {
    public CartaUno() { }

    public CartaUno(String face, int valor, Cor cor) {
        super(face, cor, valor);
    }

    @Override
    public String toString() {
        return super.getFace() + " de cor " + super.getCor();
    }
}