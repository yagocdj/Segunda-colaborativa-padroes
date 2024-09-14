package factory;

import carta.Carta;
import carta.CartaUno;
import enums.Cor;
import enums.Naipe;

public class CartaUNOFactory implements CartaFactory {
    @Override
    public Carta criarCarta(String face, int valor, Cor cor) {
        return new CartaUno(face, valor, cor);
    }

    @Override
    public Carta criarCarta(String face, int valor, Cor cor, Naipe naipe) {
        throw new UnsupportedOperationException("Cartas UNO não possuem naipe.");
    }
}
